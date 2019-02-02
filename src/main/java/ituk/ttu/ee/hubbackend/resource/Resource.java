package ituk.ttu.ee.hubbackend.resource;

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
public class Resource {
    @NotNull private Long id;
    @NotNull private String name;
    @NotNull private String comment;
    @NotNull private String url;
    @NotNull private LocalDateTime createdat;
    @NotNull private LocalDateTime updatedat;
    @NotNull private Long authorid;
}
