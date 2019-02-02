package ituk.ttu.ee.hubbackend.user;

import ituk.ttu.ee.hubbackend.model.User;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return null; //TODO return only needed variables
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable("id") String id) {
        return null; //TODO return only one user
    }

    @PutMapping("/update/{user}")
    public void updateUser(@PathParam("user") User user) {
        //TODO update user info over API
    }

    @PostMapping("/add/{user}")
    public void addUser(@PathParam("user") User user) {
        //TODO add new user to DB
    }









}
