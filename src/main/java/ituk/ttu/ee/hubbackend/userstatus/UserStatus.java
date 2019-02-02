package ituk.ttu.ee.hubbackend.userstatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserStatus {
    @NotNull private Long statusid;
    @NotNull private String statusname;
    @NotNull private String description;
}
