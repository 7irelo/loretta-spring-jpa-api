package com.lorettabank;

import com.lorettabank.model.entity.Account;
import com.lorettabank.model.entity.User;

import java.util.HashSet;

public final class TestDataUtil {

    private TestDataUtil() {

    }

    public static User createTestUserA() {
        return User.builder().id(1L).username("7irelo")
                .password("password").firstName("Eric")
                .lastName("Ncube").email("tirelo.eric@gmail.com")
                .phone("+27-80-005-5555").address("Empire State" +
                        " Building").roles(new HashSet<>())
                .occupation("Full Stack Developer").build();
    }

    public static User createTestUserB() {
        return User.builder().id(2L).username("kidrife")
                .password("password").firstName("Kid")
                .lastName("Rife").email("kidrife76@gmail.com")
                .phone("+27-81-001-0111").address("The Pentagon")
                .roles(new HashSet<>()).occupation("Sound Engineer").build();
    }

    public static User createTestUserC() {
        return User.builder().id(3L).username("alkebulan")
                .password("password").firstName("Al")
                .lastName("Kebulan").email("alkebulan@gmail.com")
                .phone("+27-03-006-0009").address("Wakanda")
                .roles(new HashSet<>()).occupation("Philosopher").build();
    }

    public static Account createTestAccountA(final User user) {
        return Account.builder().id(1L).user(user).type("Cheque")
                .balance(599.99D).status("active").build();
    }

    public static Account createTestAccountB(final User user) {
        return Account.builder().id(2L).user(user).type("Savings")
                .balance(999.99D).status("active").build();
    }

    public static Account createTestAccountC(final User user) {
        return Account.builder().id(3L).user(user).type("Credit")
                .balance(499.99D).status("active").build();
    }
}
