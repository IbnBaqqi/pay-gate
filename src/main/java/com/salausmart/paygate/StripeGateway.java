package com.salausmart.paygate;

import com.salausmart.paygate.Dto.PaymentIntentData;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.nio.charset.StandardCharsets;


import static java.net.URLEncoder.encode;

@Service
@AllArgsConstructor
public class StripeGateway {

    private final RestClient restClient;

    public Object payment(PaymentIntentData intentData) {

        var data = "amount=" + encode(String.valueOf(intentData.getAmount()), StandardCharsets.UTF_8)
                + "&currency=" + encode(intentData.getCurrency(), StandardCharsets.UTF_8)
                + "&payment_method=" + encode(intentData.getPayment_method(), StandardCharsets.UTF_8);

        return restClient.post()
                .uri("/v1/payment_intents")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .body(data)
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }
}
