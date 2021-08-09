package com.savingsAccount.models.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.savingsAccount.models.entity.SavingsAccount;

@Repository
public interface SavingsAccountRepository extends ReactiveMongoRepository<SavingsAccount, String> {

}
