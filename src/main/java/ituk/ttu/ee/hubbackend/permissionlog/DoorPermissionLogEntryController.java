package ituk.ttu.ee.hubbackend.permissionlog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("door-permission-logs")
public class DoorPermissionLogEntryController {

    @Resource
    private DoorPermissionLogEntryService doorPermissionLogEntryService;

    @GetMapping
    public List<DoorPermissionLogEntry> getDoorPermissionLogs() {
        return doorPermissionLogEntryService.getAll();
    }
}
