package com.savingsAccount.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.savingsAccount.models.entity.SavingsAccount;
import com.savingsAccount.models.repository.SavingsAccountRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SavingsAccountServiceImpl implements SavingsAccountService {

	@Autowired
	private SavingsAccountRepository repository;
	
	@Override
	public Flux<SavingsAccount> getAll() {
		return repository.findAll();
	}

	@Override
	public Mono<SavingsAccount> insert(SavingsAccount savingsAccount) {
		return repository.insert(savingsAccount);
	}

}
