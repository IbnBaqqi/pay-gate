package com.salausmart.paygate;

import lombok.Data;

@Data
public class Card {

    // Add validations

    private String number;
    private Integer expMonth;
    private Integer expYear;
    private String cvc;

}
