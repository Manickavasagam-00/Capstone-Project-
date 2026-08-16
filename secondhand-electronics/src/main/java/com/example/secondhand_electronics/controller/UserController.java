package com.example.secondhand_electronics.controller;

import com.example.secondhand_electronics.entity.User;
import com.example.secondhand_electronics.service.EmailService;
import com.example.secondhand_electronics.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final EmailService emailService;

    public UserController(UserService userService, EmailService emailService) {
        this.userService = userService;
        this.emailService = emailService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {

        User registeredUser = userService.registerUser(user);

        emailService.sendRegistrationEmail(
                registeredUser.getEmail(),
                registeredUser.getName()
        );

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) {

        User loggedInUser = userService.loginUser(
                user.getEmail(),
                user.getPassword()
        );

        if (loggedInUser != null) {

            emailService.sendLoginNotification(
                    loggedInUser.getEmail()
            );

            return ResponseEntity.ok(loggedInUser);
        }

        return ResponseEntity
                .status(401)
                .body("Invalid email or password");
    }

    @PutMapping("/change-password")
    public ResponseEntity<?> changePassword(
            @RequestBody ChangePasswordRequest request) {

        boolean changed = userService.changePassword(
                request.getEmail(),
                request.getCurrentPassword(),
                request.getNewPassword()
        );

        if (changed) {
            return ResponseEntity.ok("Password changed successfully");
        }

        return ResponseEntity
                .status(400)
                .body("Invalid email or current password");
    }
}