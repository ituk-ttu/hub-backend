package ituk.ttu.ee.hubbackend.permissionlog;

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
    @NotNull private Long modifiedby;
    @NotNull private LocalDateTime updatedat;
    @NotNull private String change;
}
