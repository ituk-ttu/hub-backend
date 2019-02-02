package ituk.ttu.ee.hubbackend.doorpermission;

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
    @NotNull private String doorcode;
    @NotNull private Long userid;
}
