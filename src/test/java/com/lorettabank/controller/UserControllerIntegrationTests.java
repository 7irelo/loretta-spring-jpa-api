//package com.lorettabank.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.lorettabank.TestDataUtil;
//import com.lorettabank.model.entity.User;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//public class UserControllerIntegrationTests {
//
//    private MockMvc mockMvc;
//
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    public UserControllerIntegrationTests(MockMvc mockMvc, ObjectMapper objectMapper) {
//        this.mockMvc = mockMvc;
//        this.objectMapper = objectMapper;
//    }
//
//    @Test
//    public void testThatCreateUserSuccessfullyReturnsHttp201Created() throws Exception {
//        User user = TestDataUtil.createTestUserA();
//        user.setId(null);
//        String userJson = objectMapper.writeValueAsString(user);
//
//        mockMvc.perform(
//                MockMvcRequestBuilders.post("/users")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(userJson)
//        ).andExpect(
//                MockMvcResultMatchers.status().isCreated()
//        );
//    }
//}
