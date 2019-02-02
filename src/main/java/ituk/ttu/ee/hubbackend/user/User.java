package ituk.ttu.ee.hubbackend.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull private Long id;
    @NotNull private String firstname;
    @NotNull private String lastname;
    @NotNull private String email;
    @NotNull private String cardnumber;
    @NotNull private String telegram;
    @NotNull private String password;
    @NotNull private String studentcode;
    @NotNull private Long status;
    @NotNull private String curriculum;
    @NotNull private String iban;
    @NotNull private Long mentorid;
    @NotNull private Boolean admin;
    @NotNull private Boolean archived;
    @NotNull private LocalDateTime createdat;
    @NotNull private LocalDateTime updatedat;
}
