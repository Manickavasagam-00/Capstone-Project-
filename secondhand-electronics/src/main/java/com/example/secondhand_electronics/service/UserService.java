package com.example.secondhand_electronics.service;

import com.example.secondhand_electronics.entity.User;
import com.example.secondhand_electronics.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
    public boolean changePassword(String email, String currentPassword, String newPassword) {

    User user = userRepository.findByEmail(email);

    if (user == null) {
        return false;
    }

    if (!user.getPassword().equals(currentPassword)) {
        return false;
    }

    user.setPassword(newPassword);
    userRepository.save(user);

    return true;
}
}