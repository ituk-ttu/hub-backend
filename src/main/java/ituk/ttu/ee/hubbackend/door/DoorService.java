package ituk.ttu.ee.hubbackend.door;

import ituk.ttu.ee.hubbackend.externalapi.ItukApiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DoorService {

    @Resource
    ItukApiService itukApiService;

    public List<Door> getAll() {
        return itukApiService.getAllDoors();
    }

    public void create(String doorCode) {
        //TODO: make sure door does not exist? How does ituk API respond if I try to save an invalid object?
        Door door = Door.builder()
                .code(doorCode)
                .build();
        itukApiService.save(door);
    }

}
