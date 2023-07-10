package com.nttdata.com.client_microservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "creditProducts")
public class CreditProduct {
    @Id
    private String id;
    private String clientId;
    private double balance;
    private CreditProductType creditProductType;


}
