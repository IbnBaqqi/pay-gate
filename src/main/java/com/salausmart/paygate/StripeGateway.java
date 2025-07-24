package com.salausmart.paygate;

import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.net.URLEncoder.encode;

@Service
@AllArgsConstructor
public class StripeGateway {

    private final RestClient restClient;

    public void payment(Card cardDetails) {

//        Encode for application/x-www-form-urlencoded as WebClient
        String body = encode("type", "card") +
                "&" + encode("card[number]", cardDetails.getNumber()) +
                "&" + encode("card[exp_month]", String.valueOf(cardDetails.getExpMonth())) +
                "&" + encode("card[exp_year]", String.valueOf(cardDetails.getExpYear())) +
                "&" + encode("card[cvc]", cardDetails.getCvc());

        System.out.println(body);

//        var result = restClient.post()
//                .uri("/v1/payment_methods")
//                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//                .body(body)
//                .retrieve()
//                .body(new ParameterizedTypeReference<>() {});
//
//        System.out.println(result);
    }
    private String encode(String key, String value) {
        return URLEncoder.encode(key, StandardCharsets.UTF_8) + "=" + URLEncoder.encode(value, StandardCharsets.UTF_8);
    }
}
