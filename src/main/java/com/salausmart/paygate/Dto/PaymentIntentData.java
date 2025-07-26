package com.salausmart.paygate.Dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentIntentData {

    @NotNull(message = "Amount is required")
    private Integer amount;

    @NotNull(message = "Currency is required")
    private String currency;

    @NotNull(message = "Payment method required")
    private String payment_method;

    @NotNull(message = "Enable or disable automatic payment method")
    private boolean enable;
}
