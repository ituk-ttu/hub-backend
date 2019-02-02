package ituk.ttu.ee.hubbackend.door;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/doors")
public class DoorController {

    @Resource
    private DoorService doorService;

    @GetMapping
    public List<Door> getAllDoors() {
        return doorService.getAll();
    }

    @PostMapping("/create/{doorCode}")
    public ResponseEntity<?> createNewDoor(@PathVariable String doorCode) {
        doorService.create(doorCode);
        return ResponseEntity.noContent().build();
    }

}
