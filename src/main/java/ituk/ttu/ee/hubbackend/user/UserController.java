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
    public User getById(@PathVariable("id") String id) {
        return null; //TODO return only one user
    }

    @PutMapping("/update/")
    public void updateUser(@RequestParam("user") User user) {
        //TODO update user info over API
    }

    @PostMapping("/add")
    public void addUser(@RequestParam("user") User user) {
        //TODO add new user to DB
    }









}
