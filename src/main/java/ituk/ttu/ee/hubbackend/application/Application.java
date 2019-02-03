package ituk.ttu.ee.hubbackend.application;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Application {
    @NotNull private UUID uuid;
    @NotNull private String firstName;
    @NotNull private String lastName;
    @NotNull private String personalCode;
    @NotNull private String email;
    @NotNull private String studentCode;
    @NotNull private String curriculum;
    @NotNull private String mentorSelectionCode;
    @NotNull private LocalDateTime createdAt;
    @NotNull private LocalDateTime updateAt;
    private Long processedById;
    private Long mentorId;
}
