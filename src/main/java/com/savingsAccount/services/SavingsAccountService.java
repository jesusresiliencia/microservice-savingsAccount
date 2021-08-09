package com.savingsAccount.services;

import com.savingsAccount.models.entity.SavingsAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SavingsAccountService {
	 Flux<SavingsAccount> getAll();
     Mono<SavingsAccount>insert(SavingsAccount savingsAccount);  /*singleton*/
}
