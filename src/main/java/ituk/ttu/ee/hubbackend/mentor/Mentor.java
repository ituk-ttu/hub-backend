package ituk.ttu.ee.hubbackend.mentor;


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
public class Mentor {
    @NotNull private Long userId;
    @NotNull private String curriculum;
    @NotNull private String text;
    @NotNull private String gif;
    @NotNull private String quote;
    @NotNull private boolean enabled;
    @NotNull private LocalDateTime createdAt;
    @NotNull private LocalDateTime updatedAt;
}
