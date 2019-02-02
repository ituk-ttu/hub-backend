# Documentation

## Intro
Classes are marked as 
## VeryUsefulClass

and methods are marked as
#### veryUsefulMethod()
<br>
<br>
<br>
<br>
<br>
<br>
<br>

## Application 

Object for applications in ITÜK. Uses Lombok to generate all the needed constructors and fields.

```
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
#### getAllApplications()
Takes a GET request from /application/all and returns all applications from database. 
```
    @GetMapping("/all")
    public List<Application> getAllApplications() {
        return null; // TODO ask API for all Applications
    }
```
#### getApplicationById()
Takes a GET request from /application/{id}, where {id} is the required applications id and returns it from database.
```
    @GetMapping("/{id}")
    public Application getApplicationById() {
        return null; // TODO ask application by ID from API
```
#### addApplication()
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
```
//@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Door {
}
```

## DoorController
DoorController class is responsible for handling all the movement between Database and frontend regarding Doors. Starting API endpoint is /doors. 
```
@RestController
@RequestMapping("/doors")
public class DoorController {
}
```

## DoorPermissionController
DoorPermissionController class is responsible for handling all the movement between Database and frontend regarding Door Permissions. Starting API endpoint is /door-permissions. 

```
@RestController
@RequestMapping("/door-permissions")
public class DoorPermissionController {
}
```

## Mentor
Object to describe mentors in ITÜK. Uses Lombok to generate all the needed constructors and fields.

```
@Data
@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class Mentor {
}
```

## MentorController
MentorController class is responsible for handling all the movement between Database and frontend regarding Door Permissions. Starting API endpoint is /mentor. 

```
@RestController
@RequestMapping("/mentors")
public class MentorController {
```

#### getAllMentors()
Takes a GET request from /mentors/all and return all mentors from database to front end. 
```
GetMapping("/all")
    public List<Mentor> getAllMentors() {
        return null; // TODO ask API for all mentors
    }
```

#### getMentorById()
Takes a GET request from /mentors/{id}, where {id} is requested mentors id from front end and returns Mentor object to front end. 
```
 @GetMapping("/{id}")
    public Mentor getMentorById() {
        return null; // TODO ask mentor by id from API
    }
```

## User
Object to describe users in ITÜK. Uses Lombok to generate all the needed constructors and fields.
```
@Data
@Builder
@NoArgsConstructor
//@AllArgsConstructor
public class User {
}
```

## UserController
UserController class is responsible for handling all the movement between Database and frontend regarding users. Starting API endpoint is /user. 
```
@RestController
@RequestMapping("/users")
public class UserController {
```

#### getAllUsers() 
Takes a GET request from /users/all and return all users from database to front end. 

```
GetMapping("")
public List<User> getAllUsers() {
    return null; //TODO return only needed variables
}
```
#### getUserById()
Takes a GET request from /users/{id}, where {id} is requested mentors id from front end and returns Mentor object to front end. 
```
@GetMapping("/{id}")
public User getUsersById(@PathVariable("id") String id) {
    return null; //TODO return only one user
}
```
#### updateUser()
Takes a PUT request from /users/update and updates info in database over API. 
```
@PutMapping("/update/")
public void updateUser(@RequestParam("user") User user) {
    //TODO update user info over API
}
```
#### addUser()
Takes a POST request from /users/add and saves a new user int database over API.
```
@PostMapping("/add")
public void addUser(@RequestParam("user") User user) {
    //TODO add new user to DB
}
```