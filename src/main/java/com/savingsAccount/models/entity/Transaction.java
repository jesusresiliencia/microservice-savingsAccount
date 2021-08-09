package com.savingsAccount.models.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Document(collection = "transaction")
public class Transaction {
	
	@Id
	private String id;
	private String transaction_type;
	private String accountNumber;
	private String customerId;
	private double amount;
	private String transaction_date;
}
