package com.example.demo.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserControllerSpringBootTest {
    @Autowired
    TestRestTemplate restTemplate;

    @Autowired
    UserRepository userRepository;

    @Test
    public void case_success() {
        // Insert data for test
        MyUser somkiat = new MyUser(1, "somkiat", 30);
        userRepository.save(somkiat);

        UserResponse expected = new UserResponse(1, "somkiat", 30);
        UserResponse result
                = restTemplate.getForObject("/user/1", UserResponse.class);
        assertEquals(1, result.getId());
        assertEquals("somkiat", result.getFirstname());
        assertEquals(30, result.getAge());

        assertEquals(expected, result);

    }

}