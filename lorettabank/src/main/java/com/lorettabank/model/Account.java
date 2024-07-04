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

    // Getters and Setters
}
