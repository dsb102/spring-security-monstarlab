package com.example.springsecuritymonstarlab;

import com.example.springsecuritymonstarlab.user.User;
import com.example.springsecuritymonstarlab.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityMonstarlabApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityMonstarlabApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("dung");
        user.setPassword(passwordEncoder.encode("dung"));
        userRepository.save(user);
        System.out.println(user);
    }
}
