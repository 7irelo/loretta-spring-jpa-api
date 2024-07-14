//package com.lorettabank;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.lorettabank.model.entity.Account;
//import com.lorettabank.model.entity.User;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class JacksonTests {
//
//    public String accountJson = "{\"id\":1,\"user\":{\"id\":1,\"username\":\"7irelo\",\"password\":\"password\",\"name\":\"Eric\",\"surname\":\"Ncube\",\"email\":\"tirelo.eric@gmail.com\",\"phone\":\"+27-80-005-5555\",\"address\":\"Empire State Building\",\"occupation\":\"Full Stack Developer\",\"created\":null,\"roles\":[],\"enabled\":true,\"authorities\":[],\"accountNonLocked\":true,\"accountNonExpired\":true,\"credentialsNonExpired\":true},\"type\":\"Cheque\",\"balance\":599.99,\"status\":\"active\",\"transactions\":null,\"created\":null}";
//    @Test
//    public void testThatObjectMapperCanCreateJsonFromJavaObject() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        User user = TestDataUtil.createTestUserA();
//        Account account = TestDataUtil.createTestAccountA(user);
//
//        String result = objectMapper.writeValueAsString(account);
//        assertThat(result).isEqualTo(accountJson);
//    }
//
//    @Test
//    public void testThatObjectMapperCanCreateJavaObjectFromJson() throws JsonProcessingException {
//
//        User user = TestDataUtil.createTestUserA();
//        Account account = TestDataUtil.createTestAccountA(user);
//
//        final ObjectMapper objectMapper = new ObjectMapper();
//        Account result = objectMapper.readValue(accountJson, Account.class);
//        assertThat(result).isEqualTo(account);
//    }
//}
