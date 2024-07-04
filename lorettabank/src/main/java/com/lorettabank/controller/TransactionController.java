package com.lorettabank.controller;

import com.lorettabank.model.Transaction;
import com.lorettabank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getTransactions(@RequestParam Long accountId) {
        return transactionService.findByAccountId(accountId);
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.save(transaction);
    }
}
