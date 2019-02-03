package ituk.ttu.ee.hubbackend.permissionlog;

import ituk.ttu.ee.hubbackend.door.Door;
import ituk.ttu.ee.hubbackend.externalapi.ItukApiService;
import ituk.ttu.ee.hubbackend.user.User;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DoorPermissionLogEntryService {

    private static final String ADD_PERMISSIONS_SUB_TITLE = "Add following permissions:";
    private static final String REMOVE_PERMISSIONS_SUB_TITLE = "Remove following permissions:";

    private static final String LINE_SEPARATOR = "\n";
    private static final String SECTION_SEPARATOR = "\n\n";
    private static final char DOOR_SEPARATOR = ',';

    private static final String NAME_LABEL = "Name: ";
    private static final String CARD_LABEL = "Card: ";
    private static final String DOORS_LABEL = "Doors: ";


    @Resource
    ItukApiService itukApiService;

    public List<DoorPermissionLogEntry> getAll() {
        return itukApiService.getDoorPermissionLogs();
    }

    public void createLogEntry(Map<Long, List<Door>> added, Map<Long, List<Door>> removed, User user) {
        DoorPermissionLogEntry entry = generateLogEntry(added, removed, user);
        itukApiService.save(entry);
    }

    private DoorPermissionLogEntry generateLogEntry(Map<Long, List<Door>> added,
                                                    Map<Long, List<Door>> removed,
                                                    User user) {
        StringBuilder sb = new StringBuilder();
        sb.append(ADD_PERMISSIONS_SUB_TITLE).append(LINE_SEPARATOR);
        generateTextFor(sb, added);
        sb.append(SECTION_SEPARATOR).append(REMOVE_PERMISSIONS_SUB_TITLE).append(LINE_SEPARATOR);
        generateTextFor(sb, removed);
        return DoorPermissionLogEntry.builder()
                .modifiedBy(user)
                .updatedAt(LocalDateTime.now())
                .change(sb.toString())
                .build();
    }

    private void generateTextFor(StringBuilder sb, Map<Long, List<Door>> changes) {
        changes.keySet().forEach(userId -> {
            Optional<User> user = itukApiService.getUserById(userId);
            if (!user.isPresent()) return;
            sb.append(NAME_LABEL).append(user.get().getFullName()).append(LINE_SEPARATOR);
            sb.append(CARD_LABEL).append(user.get().getCardNumber()).append(LINE_SEPARATOR);
            List<String> doors = changes.get(userId).stream().map(Door::getCode).collect(Collectors.toList());
            sb.append(DOORS_LABEL).append(StringUtils.join(doors, DOOR_SEPARATOR));
        });
    }

}
