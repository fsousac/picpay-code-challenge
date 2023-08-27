package com.picpaysimplificado.respositories;

import jakarta.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransationRepository extends JpaRepository<Transaction, Long> {
}
