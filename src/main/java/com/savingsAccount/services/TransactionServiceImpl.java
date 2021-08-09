package com.savingsAccount.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savingsAccount.models.entity.Transaction;
import com.savingsAccount.models.repository.TransactionRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository repository;
	
	@Override
	public Flux<Transaction> getAll() {
		return repository.findAll();
	}

	@Override
	public Mono<Transaction> insert(Transaction transaction) {
		return repository.insert(transaction);
	}

}
