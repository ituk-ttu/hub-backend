package ituk.ttu.ee.hubbackend.auth;

import ituk.ttu.ee.hubbackend.user.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    //TODO: remove mock and ask info from ituk SSO service or sth

    public User getUser() {
        return User.builder().firstName("Raul").lastName("Paatpalu").build();
    }

}
