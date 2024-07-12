package com.lorettabank;

import com.lorettabank.model.Account;
import com.lorettabank.model.User;

public final class TestDataUtil {

    private TestDataUtil() {

    }

    public static User createUserTestA() {
        return User.builder().id("0000000000001").username("7irelo")
                .password("password").firstName("Eric")
                .lastName("Ncube").email("tirelo.eric@gmail.com")
                .phone("+27-80-005-5555").address("Empire State Building")
                .occupation("Full Stack Developer").build();
    }

    public static User createUserTestB() {
        return User.builder().id("0000000000002").username("kidrife")
                .password("password").firstName("Kid")
                .lastName("Rife").email("kidrife76@gmail.com")
                .phone("+27-81-001-0111").address("The Pentagon")
                .occupation("Sound Engineer").build();
    }

    public static User createUserTestC() {
        return User.builder().id("0000000000003").username("alkebulan")
                .password("password").firstName("Al")
                .lastName("Kebulan").email("alkebulan@gmail.com")
                .phone("+27-03-006-0009").address("Wakanda")
                .occupation("Philosopher").build();
    }

    public static Account createTestAccountA() {
        User user = createUserTestA();
        return Account.builder().user(user).type("Cheque")
                .balance(599.99D).status("active").build();
    }

    public static Account createTestAccountB() {
        User user = createUserTestA();
        return Account.builder().user(user).type("Savings")
                .balance(999.99D).status("active").build();
    }

    public static Account createTestAccountC() {
        User user = createUserTestA();
        return Account.builder().user(user).type("Credit")
                .balance(499.99D).status("active").build();
    }
}
