package com.nttdata.com.client_microservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "bankAccounts")
public class BankAccount {
    @Id
    private String id;
    private AccountType accountType;
    private double balance;
    private int transactionCount;
}
