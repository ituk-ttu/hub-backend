package ituk.ttu.ee.hubbackend.application;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Application {
    @NotNull private UUID uuid;
    @NotNull private String firstname;
    @NotNull private String lastname;
    @NotNull private String personalcode;
    @NotNull private String email;
    @NotNull private String studentcode;
    @NotNull private String curriculum;
    @NotNull private String mentorselectioncode;
    @NotNull private Long createdat;
    @NotNull private Long updateat;
    private Long processedbyid;
    private Long mentorid;
}
