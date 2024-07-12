package com.lorettabank.service;

import com.lorettabank.model.Account;
import com.lorettabank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findByUserId(Long userId) {
        // Retrieve accounts by user ID
        return accountRepository.findByUserId(userId);
    }

    public Account save(Account account) {
        // Save or update an account
        return accountRepository.save(account);
    }

    public void deleteById(Long id) {
        // Delete an account by ID
        accountRepository.deleteById(id);
    }
}
