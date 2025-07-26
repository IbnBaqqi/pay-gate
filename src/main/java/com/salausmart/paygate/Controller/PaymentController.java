package com.salausmart.paygate.Controller;

import com.salausmart.paygate.Dto.PaymentIntentData;
import com.salausmart.paygate.StripeGateway;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class PaymentController {

    private StripeGateway stripeGateway;

    @PostMapping("/payment")
    public ResponseEntity<?> payment(@Valid @RequestBody PaymentIntentData intentData) {
        var paymentIntent = stripeGateway.payment(intentData);
        return ResponseEntity.ok(paymentIntent);
    }
}
