package ituk.ttu.ee.hubbackend.doorpermission;

import ituk.ttu.ee.hubbackend.door.Door;
import ituk.ttu.ee.hubbackend.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoorPermission {
    @NotNull private Long id;
    @NotNull private Door door;
    @NotNull private User user;
}
