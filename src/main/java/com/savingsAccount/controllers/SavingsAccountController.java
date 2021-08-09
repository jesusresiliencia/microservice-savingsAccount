package com.savingsAccount.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.savingsAccount.models.entity.SavingsAccount;
import com.savingsAccount.services.SavingsAccountService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/savings-account")
@RestController
public class SavingsAccountController {
	@Autowired
	private SavingsAccountService service;
	
	@Value("${config.balanceador.test}")
	private String balanceadorTest;
	
	@GetMapping("/balanceador-test")
	@ResponseStatus(code = HttpStatus.OK)
	public Flux<Map<String,Object>> balanceadorTest() {
		Map<String,Object>response=new HashMap<String,Object>();
		response.put("balanceador", balanceadorTest);
		response.put("savingsAccount", service.getAll());
		return Flux.just(response);
	}
	
	@GetMapping("/getall")
	@ResponseStatus(code = HttpStatus.OK)
	public Flux<SavingsAccount> getAll() {
		return service.getAll();
	}

	@PostMapping("/save")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Mono<SavingsAccount> insert(@RequestBody SavingsAccount savingsAccount) {
		return service.insert(savingsAccount);
	}
}
