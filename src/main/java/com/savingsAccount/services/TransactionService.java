package com.savingsAccount.services;

import com.savingsAccount.models.entity.Transaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionService {
	 Flux<Transaction> getAll();
     Mono<Transaction>insert(Transaction transaction);  
}
