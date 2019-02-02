package ituk.ttu.ee.hubbackend.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    //TODO: make sure that corresponds with db
    private Long id;
    private String firstName;
    private String lastName;
    private String card;


    public String getFullName() {
        return firstName + " " + lastName;
    }
}
