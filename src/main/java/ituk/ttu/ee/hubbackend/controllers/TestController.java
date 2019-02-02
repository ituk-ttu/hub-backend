package ituk.ttu.ee.hubbackend.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "/alo")
    public ResponseEntity<String> test() {
        return ResponseEntity.status(HttpStatus.OK).body("test");
    }
}
