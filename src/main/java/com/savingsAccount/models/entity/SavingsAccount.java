package com.savingsAccount.models.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Document(collection = "savings_account")
public class SavingsAccount {

	@Id
	private String id;
	private String accountNumber;
	private String customerId;
	private String created_date;
	
}
