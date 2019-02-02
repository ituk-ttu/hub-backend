package ituk.ttu.ee.hubbackend.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("")
    public List<User> getAllUsers() {
        return null; //TODO return only needed variables
    }

    @GetMapping("/{id}")
    public User getUsersById(@PathVariable("id") String id) {
        return null; //TODO return only one user
    }

    @PutMapping("/update/")
    public void updateUser(@RequestBody User user) {
        //TODO update user info over API
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        //TODO add new user to DB
    }









}
