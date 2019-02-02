package ituk.ttu.ee.hubbackend.permissionlog;

import ituk.ttu.ee.hubbackend.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoorPermissionLogEntry {
    //TODO: make sure that corresponds with db
    private LocalDateTime modifiedAt;
    private User modifiedBy;
    private String entry;
}
