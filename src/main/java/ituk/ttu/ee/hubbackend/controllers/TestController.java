package ituk.ttu.ee.hubbackend.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(description="Controller description instead of it's name")
public class TestController {

    @GetMapping(value = "/alo")
    @ApiOperation(value = "Some more indepth description")
    public ResponseEntity<String> test() {
        return ResponseEntity.status(HttpStatus.OK).body("test");
    }
}
