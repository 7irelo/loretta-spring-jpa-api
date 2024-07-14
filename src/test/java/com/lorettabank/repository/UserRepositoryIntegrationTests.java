//package com.lorettabank.repository;
//
//import com.lorettabank.TestDataUtil;
//import com.lorettabank.model.entity.User;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//public class UserRepositoryIntegrationTests {
//
//    private final UserRepository underTest;
//
//    @Autowired
//    public UserRepositoryIntegrationTests(UserRepository underTest) {
//        this.underTest = underTest;
//    }
//    @Test
//    public void testThatUserCanBeCreatedAndRecalled() {
//
//        User user = TestDataUtil.createTestUserA();
//        underTest.save(user);
//        Optional<User> result = underTest.findById(user.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(user);
//    }
//
//    @Test
//    public void testThatMultipleUsersCanBeCreatedAndRecalled() {
//        User userA = TestDataUtil.createTestUserA();
//        underTest.save(userA);
//        User userB = TestDataUtil.createTestUserB();
//        underTest.save(userB);
//        User userC = TestDataUtil.createTestUserC();
//        underTest.save(userC);
//
//        Iterable<User> result = underTest.findAll();
//        assertThat(result).hasSize(3).containsExactly(userA, userB, userC);
//    }
//
//    @Test
//    public void testThatUserCanBeUpdated() {
//        User user = TestDataUtil.createTestUserA();
//        underTest.save(user);
//        user.setFirstName("Updated");
//        underTest.save(user);
//        Optional<User> result = underTest.findById(user.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(user);
//    }
//
//    @Test
//    public void testThatUserCanBeDeleted() {
//        User user = TestDataUtil.createTestUserA();
//        underTest.save(user);
//        underTest.deleteById(user.getId());
//        Optional<User> result = underTest.findById(user.getId());
//        assertThat(result).isEmpty();
//    }
//}
