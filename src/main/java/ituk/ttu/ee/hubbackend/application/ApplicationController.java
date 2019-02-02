package ituk.ttu.ee.hubbackend.application;

import ituk.ttu.ee.hubbackend.model.Application;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @GetMapping("/all")
    public List<Application> getAllApplications() {
        return null; //TODO ask API for all Applications
    }

    @GetMapping("/{id}")
    public Application getApplicationById() {
        return null; //TODO ask application by ID from API
    }

    @PostMapping("/add/{application}")
    public void addApplication(@PathVariable("application") Application application) {
        //TODO Send new Application over API to DB
    }

}
