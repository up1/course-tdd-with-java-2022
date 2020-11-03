package com.example.demo.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
class UserControllerWebMvcTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private UserService userService;

    @Test
    public void success_with_user() throws Exception {
        UserDomain somkiat = new UserDomain();
        somkiat.setId(100);
        somkiat.setFirstname("mock firstname");
        somkiat.setAge(30);
        when(userService.get(100)).thenReturn(somkiat);

        MvcResult mvcResult = mvc.perform(get("/user/100"))
                .andExpect(status().isOk())
                .andReturn();

        String response = mvcResult.getResponse().getContentAsString();
        ObjectMapper mapper = new ObjectMapper();
        UserResponse result = mapper.readValue(response, UserResponse.class);

        assertEquals(100, result.getId());
        assertEquals("mock firstname", result.getFirstname());
        assertEquals(30, result.getAge());
    }

}