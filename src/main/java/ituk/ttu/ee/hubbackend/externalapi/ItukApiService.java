package ituk.ttu.ee.hubbackend.externalapi;

import ituk.ttu.ee.hubbackend.door.Door;
import ituk.ttu.ee.hubbackend.doorpermission.DoorPermission;
import ituk.ttu.ee.hubbackend.permissionlog.DoorPermissionLogEntry;
import ituk.ttu.ee.hubbackend.user.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@Service
public class ItukApiService {

    //TODO: remove all mocks and connect to ituk api
    // NB! If you need to mock a get service then make sure you return a copy of the static list/object etc to avoid weird shit

    private static List<Door> doors = new ArrayList<>();
    private static List<DoorPermission> doorPermissions = new ArrayList<>();
    private static List<DoorPermissionLogEntry> doorPermissionLogEntry = new ArrayList<>();

    public void save(DoorPermission permission) {
        doorPermissions.add(permission);
    }

    public void save(DoorPermissionLogEntry permissionLog) {
        doorPermissionLogEntry.add(permissionLog);
    }

    public void save(Door door) {
        doors.add(door);
    }

    public List<Door> getAllDoors() {
        return new ArrayList<>(doors);
    }

    public void delete(DoorPermission permission) {
        doorPermissions.remove(permission);
    }

    public Optional<User> getUserById(Long userId) {
        List<User> users = asList(
                User.builder().id(1L).firstName("Groot").lastName("Tree").card("S6436475312761N").build(),
                User.builder().id(2L).firstName("Rasmus").lastName("Rüngennenenenenen").card("S345126748N").build(),
                User.builder().id(3L).firstName("Liine").lastName("Kasak").card("4316 6526 7275 0126").build()
        );
        return users.stream().filter(user -> user.getId().equals(userId)).findAny();
    }

    public List<DoorPermission> getAllDoorPermissions() {
        return new ArrayList<>(doorPermissions);
    }

    public List<DoorPermission> getAllDoorPermissionsByUserId(Long userId) {
        return doorPermissions.stream()
                .filter(permission -> permission.getUser().getId().equals(userId))
                .collect(Collectors.toList());
    }

    public List<DoorPermissionLogEntry> getDoorPermissionLogs() {
        return new ArrayList<>(doorPermissionLogEntry);
    }

}
