package ituk.ttu.ee.hubbackend.door;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Door {
    //TODO: make sure that corresponds with db
    private String code;
}
