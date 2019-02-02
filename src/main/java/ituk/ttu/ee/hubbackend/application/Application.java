package ituk.ttu.ee.hubbackend.application;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Application {
    //TODO: make sure that corresponds with db
    private UUID uuid;
}
