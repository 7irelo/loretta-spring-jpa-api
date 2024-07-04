package com.lorettabank.service;

import com.lorettabank.model.Transaction;
import com.lorettabank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> findByAccountId(Long accountId) {
        return transactionRepository.findByAccountId(accountId);
    }

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
