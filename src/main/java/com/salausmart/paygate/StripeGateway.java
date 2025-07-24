package com.salausmart.paygate;

import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@AllArgsConstructor
public class StripeGateway {

    private final RestClient restClient;

    public void checkout() {
        var result = restClient.get()
                .uri("/v1//checkout/sessions")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});

        System.out.println(result);
    }
}
