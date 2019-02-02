package ituk.ttu.ee.hubbackend.application;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @GetMapping()
    public List<Application> getAllApplications() {
        return null; // TODO ask API for all Applications
    }

    @GetMapping("/{id}")
    public Application getApplicationById(@PathVariable Long id) {
        return null; // TODO ask application by ID from API
    }

    @PostMapping("/add")
    public void addApplication(@RequestBody Application application) {
        //TODO Send new Application over API to DB
    }

}
