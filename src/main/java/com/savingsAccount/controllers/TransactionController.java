package com.savingsAccount.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.savingsAccount.models.entity.Transaction;
import com.savingsAccount.services.TransactionService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/transaction")
@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService service;
	
	@GetMapping("/getall")
	@ResponseStatus(code = HttpStatus.OK)
	public Flux<Transaction> getAll() {
		return service.getAll();
	}

	@PostMapping("/save")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Mono<Transaction> insert(@RequestBody Transaction transaction) {
		return service.insert(transaction);
	}
}
