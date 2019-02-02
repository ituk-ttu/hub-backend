package ituk.ttu.ee.hubbackend.doorpermission;

import ituk.ttu.ee.hubbackend.auth.AuthService;
import ituk.ttu.ee.hubbackend.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/door-permissions")
public class DoorPermissionController {

    @Resource
    private DoorPermissionService doorPermissionService;

    @Resource
    private AuthService authService;

    @GetMapping
    public List<DoorPermission> getAllPermissions() {
        return doorPermissionService.getAll();
    }

    @GetMapping("/{userId}")
    public List<DoorPermission> getUserPermissions(@PathVariable Long userId) {
        return doorPermissionService.getByUserId(userId);
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateAllPermissions(@RequestBody List<DoorPermission> permissions) {
        User user = authService.getUser();
        doorPermissionService.update(permissions, user);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("update/{userId}")
    public ResponseEntity<?> updateUserPermissions(@PathVariable Long userId,
                                                   @RequestBody List<DoorPermission> permissions) {
        User user = authService.getUser();
        doorPermissionService.update(permissions, userId, user);
        return ResponseEntity.noContent().build();
    }

}
