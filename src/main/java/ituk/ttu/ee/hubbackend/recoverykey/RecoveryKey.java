package ituk.ttu.ee.hubbackend.recoverykey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecoveryKey {
    @NotNull private Long id;
    @NotNull private String key;
    @NotNull private LocalDateTime createdat;
    @NotNull private LocalDateTime updatedat;
    @NotNull private Long userid;
}
