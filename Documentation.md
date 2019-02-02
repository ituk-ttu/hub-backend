# Documentation

## Application 

Object for applications in ITÜK. Uses Lombok to generate all the needed constructors and fields.

```java
//@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Application {
}
```
## ApplicationController

ApplicationController class is responsible for handling all the movement between Database and frontend regarding Applications. Starting API endpoint is /applications. 
```
@RestController
@RequestMapping("/applications")
public class ApplicationController {
```
#### getAllApplications
Takes a GET request from /application/all and returns all applications from database. 
```
    @GetMapping("/all")
    public List<Application> getAllApplications() {
        return null; // TODO ask API for all Applications
    }
```
#### getApplicationById
Takes a GET request from /application/{id}, where {id} is the required applications id and returns it from database.
```
    @GetMapping("/{id}")
    public Application getApplicationById() {
        return null; // TODO ask application by ID from API
```
#### addApplication
Takes a new application from /application/add and sends it over API to database
```
    @PostMapping("/add")
    public void addApplication(@RequestParam("application") Application application) {
        //TODO Send new Application over API to DB
    }
}
```
---
## Door
Object to describe door related to ITÜK. Uses Lombok to generate all the needed constructors and fields.
```java
//@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Door {
}
```

## DoorController
