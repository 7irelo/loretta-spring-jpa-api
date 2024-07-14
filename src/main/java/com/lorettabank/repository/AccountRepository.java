package com.lorettabank.repository;

import com.lorettabank.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByUserId(Long userId);

    List<Account> balanceLessThan(Double amount);

    @Query("SELECT a from Account a where a.balance > ?1")
    Iterable<Account> findAccountWithBalanceGreaterTgan(Double amount);
}
