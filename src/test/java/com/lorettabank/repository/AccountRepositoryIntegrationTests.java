//package com.lorettabank.repository;
//
//import com.lorettabank.TestDataUtil;
//import com.lorettabank.model.entity.Account;
//import com.lorettabank.model.entity.User;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//public class AccountRepositoryIntegrationTests {
//
//    private AccountRepository underTest;
//
//    @Autowired
//    public AccountRepositoryIntegrationTests(AccountRepository underTest) {
//        this.underTest = underTest;
//    }
//
//    @Test
//    public void testThatAccountCanBeCreatedAndRecalled() {
//        User user = TestDataUtil.createTestUserA();
//        Account account = TestDataUtil.createTestAccountA(user);
//        underTest.save(account);
//        Optional<Account> result = underTest.findById(account.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(account);
//    }
//
//    @Test
//    public void testThatMultipleAccountsCanBeCreatedAndRecalled() {
//        User user = TestDataUtil.createTestUserA();
//
//        Account accountA = TestDataUtil.createTestAccountA(user);
//        underTest.save(accountA);
//
//        Account accountB = TestDataUtil.createTestAccountB(user);
//        underTest.save(accountB);
//
//        Account accountC = TestDataUtil.createTestAccountC(user);
//        underTest.save(accountA);
//
//        List<Account> result = underTest.findAll();
//        assertThat(result).hasSize(3).containsExactly(accountA, accountB, accountC);
//    }
//
//    @Test
//    public void testThatAccountCanBeUpdated() {
//        User user = TestDataUtil.createTestUserA();
//
//        Account account = TestDataUtil.createTestAccountA(user);
//        underTest.save(account);
//
//        account.setType("Transmission");
//        underTest.save(account);
//
//        Optional<Account> result = underTest.findById(account.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(account);
//    }
//
//    @Test
//    public void testThatAccountCanBeDelete() {
//        User user = TestDataUtil.createTestUserA();
//
//        Account account = TestDataUtil.createTestAccountA(user);
//        underTest.save(account);
//
//        underTest.deleteById(account.getId());
//        Optional<Account> result = underTest.findById(account.getId());
//        assertThat(result).isEmpty();
//    }
//}
