package ituk.ttu.ee.hubbackend.doorpermission;

import ituk.ttu.ee.hubbackend.door.Door;
import ituk.ttu.ee.hubbackend.externalapi.ItukApiService;
import ituk.ttu.ee.hubbackend.permissionlog.DoorPermissionLogEntryService;
import ituk.ttu.ee.hubbackend.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DoorPermissionService {

    @Resource
    private ItukApiService itukApiService;
    @Resource
    private DoorPermissionLogEntryService logEntryService;

    public List<DoorPermission> getAll() {
        return itukApiService.getAllDoorPermissions();
    }

    public List<DoorPermission> getByUserId(Long userId) {
        return itukApiService.getAllDoorPermissionsByUserId(userId);
    }

    public void update(List<DoorPermission> permissions, User modifier) {
        List<DoorPermission> originalPermissions = itukApiService.getAllDoorPermissions();
        update(originalPermissions, permissions, modifier);
    }

    public void update(List<DoorPermission> permissions, Long userId, User modifier) {
        List<DoorPermission> originalPermissions = itukApiService.getAllDoorPermissionsByUserId(userId);
        update(originalPermissions, permissions, modifier);
    }

    private void update(List<DoorPermission> original, List<DoorPermission> updated, User modifier) {
        Map<Long, List<Door>> added = saveNewPermissions(original, updated);
        Map<Long, List<Door>> removed = deleteRemovedPermissions(original, updated);
        logEntryService.createLogEntry(added, removed, modifier);
    }

    private Map<Long, List<Door>> saveNewPermissions(List<DoorPermission> original, List<DoorPermission> updated) {
        Map<Long, List<Door>> added = new HashMap<>();
        updated.stream()
                .filter(permission -> !original.contains(permission))
                .forEach(permission -> {
                    Long userId = permission.getUser().getId();
                    List<Door> doors = added.getOrDefault(userId, new ArrayList<>());
                    doors.add(permission.getDoor());
                    added.put(userId, doors);
                    itukApiService.save(permission);
                });
        return added;
    }

    private Map<Long, List<Door>> deleteRemovedPermissions(List<DoorPermission> original, List<DoorPermission> updated) {
        Map<Long, List<Door>> removed = new HashMap<>();
        original.stream()
                .filter(permission -> !updated.contains(permission))
                .forEach(permission -> {
                    Long userId = permission.getUser().getId();
                    List<Door> doors = removed.getOrDefault(userId, new ArrayList<>());
                    doors.add(permission.getDoor());
                    removed.put(userId, doors);
                    itukApiService.delete(permission);
                });
        return removed;
    }

}
