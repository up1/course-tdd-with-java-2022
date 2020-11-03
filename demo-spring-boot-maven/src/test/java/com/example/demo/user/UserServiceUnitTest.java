package com.example.demo.user;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceUnitTest {

    @Mock
    private UserRepository userRepository;

    @Test
    public void user_not_found_with_id_100() {
        when(userRepository.findById(100)).thenReturn(Optional.empty());

        UserService userService = new UserService(userRepository);

        Exception e = assertThrows(RuntimeException.class,
                () -> userService.get(100));
        assertEquals("User not found with id=100", e.getMessage());
    }

}