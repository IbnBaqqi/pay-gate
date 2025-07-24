package com.salausmart.paygate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaygateApplication {

	public static void main(String[] args) {
		var appContext = SpringApplication.run(PaygateApplication.class, args);

		appContext.getBean(StripeGateway.class).checkout();
	}

}
