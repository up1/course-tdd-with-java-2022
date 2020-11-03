package com.example.demo.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void should_found_user() {
        // Add data test
        MyUser user1 = new MyUser(1, "Demo 01", 25);
        userRepository.save(user1);
        // Test
        Optional<MyUser> result = userRepository.findById(1);
        // Assert
        assertTrue(result.isPresent());
    }

    @Test
    public void should_not_found_user() {
        // Test
        Optional<MyUser> result = userRepository.findById(1);
        // Assert
        assertFalse(result.isPresent());
    }


}