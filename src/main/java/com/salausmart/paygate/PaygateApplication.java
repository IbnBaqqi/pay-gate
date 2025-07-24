package com.salausmart.paygate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;

@SpringBootApplication
public class PaygateApplication {

	public static void main(String[] args) {
		var appContext = SpringApplication.run(PaygateApplication.class, args);

		Card card = new Card();
		card.setNumber("4242 4242 4242 4242");
		card.setExpMonth(12);
		card.setExpYear(27);
		card.setCvc("123");

		appContext.getBean(StripeGateway.class).payment(card);
	}

}
