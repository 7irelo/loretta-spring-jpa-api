package com.lorettabank.controller;

import com.lorettabank.model.Transaction;
import com.lorettabank.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Transaction> createTransaction(@Valid @RequestBody Transaction transaction) {
        Transaction createdTransaction = transactionService.save(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTransaction);
    }
}
