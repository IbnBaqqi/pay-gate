package com.salausmart.paygate.Controller;

import com.salausmart.paygate.Card;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @PostMapping("/payment")
    public ResponseEntity<?> payment(@RequestBody(required = false) Card card) {
        return null;
    }
}
