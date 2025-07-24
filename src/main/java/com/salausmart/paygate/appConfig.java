package com.salausmart.paygate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class appConfig {

    @Value("${Stripe.base-url}")
    private String baseUrl;

    @Value("${Stripe.secret}")
    private String secret;

    @Bean
    public RestClient restClient() {
        return RestClient
                .builder()
                .baseUrl(baseUrl)
                .defaultHeader("Authorization", "Bearer " + secret)
                .build();
    }
}
