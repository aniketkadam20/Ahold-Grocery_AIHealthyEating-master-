package aholdai.aholdaiserver.controllers;

import aholdai.aholdaiserver.models.AholdUser;
import aholdai.aholdaiserver.services.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{email}")
    public AholdUser getUserByEmail (@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping()
    public AholdUser createUser(@RequestBody AholdUser newUser) {
        return userService.createUser(newUser);
    }


}
