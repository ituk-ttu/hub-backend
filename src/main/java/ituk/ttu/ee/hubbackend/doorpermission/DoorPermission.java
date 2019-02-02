package ituk.ttu.ee.hubbackend.doorpermission;

import ituk.ttu.ee.hubbackend.door.Door;
import ituk.ttu.ee.hubbackend.user.User;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoorPermission {
    //TODO: make sure that corresponds with db
    private Long id;
    private User user;
    private Door door;
}
