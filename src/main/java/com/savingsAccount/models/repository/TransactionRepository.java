package com.savingsAccount.models.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.savingsAccount.models.entity.Transaction;

@Repository
public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {

}
