package com.lorettabank.controller;

import com.lorettabank.model.entity.Account;
import com.lorettabank.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAccounts(@RequestParam Long userId) {
        return accountService.findByUserId(userId);
    }

    @PostMapping
    public Account createAccount(@Valid @RequestBody Account account) {
        return accountService.save(account);
    }

    @PutMapping("/{id}")
    public Account updateAccount(@PathVariable Long id, @Valid @RequestBody Account account) {
        account.setId(id);
        return accountService.save(account);
    }

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable Long id) {
        accountService.deleteById(id);
        return "Account deleted";
    }
}
