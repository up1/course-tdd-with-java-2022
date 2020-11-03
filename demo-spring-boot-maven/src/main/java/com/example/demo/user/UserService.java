package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDomain get(int id) {
        Optional<MyUser> result = userRepository.findById(id);
        if (!result.isPresent()) {
            throw new RuntimeException("User not found with id=" + id);
        }
        UserDomain userDomain = new UserDomain();
        userDomain.setId(result.get().getId());
        userDomain.setFirstname(result.get().getFirstname());
        userDomain.setAge(result.get().getAge());
        return userDomain;
    }
}
