package com.nttdata.com.client_microservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "creditCards")
public class CreditCard {
    @Id
    private String id;
    private double creditLimit;
    private double availableBalance;
}
