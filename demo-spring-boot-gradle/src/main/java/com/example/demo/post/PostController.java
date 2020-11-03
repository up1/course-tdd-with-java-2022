package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostGateway postGateway;

    @GetMapping("/post/{id}")
    public PostResponse get(@PathVariable int id) {
        Optional<PostResponse> result =  postGateway.getPostById(id);
        return result.get();
    }
}
