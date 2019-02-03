package ituk.ttu.ee.hubbackend.permissionlog;

import ituk.ttu.ee.hubbackend.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoorPermissionLogEntry {
    @NotNull private Long id;
    @NotNull private User modifiedBy;
    @NotNull private LocalDateTime updatedAt;
    @NotNull private String change;
}
