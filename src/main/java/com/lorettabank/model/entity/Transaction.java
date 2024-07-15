package com.lorettabank.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transactions")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", nullable = false)
    @NotNull(message = "Account is mandatory")
    private Account account;

    @Column(nullable = false)
    @NotNull(message = "Amount is mandatory")
    private Double amount;

    @Column(nullable = false)
    @NotBlank(message = "Transaction type is mandatory")
    private String type;

    @Column(nullable = false)
    @NotBlank(message = "Description is mandatory")
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date timestamp;

    @PrePersist
    protected void onCreate() {
        timestamp = new Date();
    }
}
