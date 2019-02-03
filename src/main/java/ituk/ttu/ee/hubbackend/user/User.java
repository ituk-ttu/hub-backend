package ituk.ttu.ee.hubbackend.user;

import ituk.ttu.ee.hubbackend.mentor.Mentor;
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
    @NotNull private String firstName;
    @NotNull private String lastName;
    @NotNull private String email;
    @NotNull private String cardNumber;
    @NotNull private String telegram;
    @NotNull private String password;
    @NotNull private String studentCode;
    @NotNull private UserStatus status;
    @NotNull private String curriculum;
    @NotNull private String iban;
    @NotNull private Mentor mentor;
    @NotNull private boolean admin;
    @NotNull private boolean archived;
    @NotNull private LocalDateTime createdAt;
    @NotNull private LocalDateTime updatedAt;


    public String getFullName() {
        return firstName + " " + lastName;
    }

}
