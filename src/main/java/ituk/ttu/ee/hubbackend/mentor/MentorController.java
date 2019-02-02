package ituk.ttu.ee.hubbackend.mentor;

import ituk.ttu.ee.hubbackend.model.Mentor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mentors")
public class MentorController {

    @GetMapping("/all")
    public List<Mentor> getAllMentors() {
        return null; // TODO ask API for all mentors
    }

    @GetMapping("/{id}")
    public Mentor getMentorById() {
        return null; // TODO ask mentor by id from API
    }


}
