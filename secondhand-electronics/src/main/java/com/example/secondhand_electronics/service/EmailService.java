package com.example.secondhand_electronics.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendLoginNotification(String email) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(email);
        message.setSubject("Login Notification - Second-Hand Electronics");

        message.setText(
                "Hello,\n\n" +
                "Your account was successfully logged in to the " +
                "Second-Hand Electronics Trading Platform.\n\n" +
                "If this was not you, please change your password immediately.\n\n" +
                "Regards,\n" +
                "Second-Hand Electronics Team"
        );

        mailSender.send(message);
    }

    public void sendRegistrationEmail(String email, String name) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(email);
        message.setSubject("Welcome - Second-Hand Electronics");

        message.setText(
                "Hello " + name + ",\n\n" +
                "Your account has been successfully created on the " +
                "Second-Hand Electronics Trading Platform.\n\n" +
                "You can now log in and start using the platform.\n\n" +
                "Regards,\n" +
                "Second-Hand Electronics Team"
        );

        mailSender.send(message);
    }
}