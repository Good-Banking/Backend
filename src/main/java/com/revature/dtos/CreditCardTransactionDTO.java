package com.revature.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardTransactionDTO {

    private Integer id;
    private double amount;
    private String description;
    private Integer creditCardId;
    private Integer accountId;



}

