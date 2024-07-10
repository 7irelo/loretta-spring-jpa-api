package com.lorettabank.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private Double balance;

    @OneToMany(mappedBy = "account")
    private Set<Transaction> transactions;

    // Constructors, getters, and setters

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for user
    public User getUser() {
        return user;
    }

    // Setter for user
    public void setUser(User user) {
        this.user = user;
    }

    // Getter for balance
    public Double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    // Getter for transactions
    public Set<Transaction> getTransactions() {
        return transactions;
    }

    // Setter for transactions
    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }
}
