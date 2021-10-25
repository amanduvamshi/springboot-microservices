package com.krishna.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = { "com.krishna" })
@RestController("/payment")
public class PaymentServiceApplication {

	static Map<String, String> paymentInfo = new HashMap<String, String>();

	public static void main(String[] args) {
		paymentInfo.put("cardNumber", "123456");
		paymentInfo.put("cvv", "123");
		paymentInfo.put("mobileNumber", "12345");
		SpringApplication.run(PaymentServiceApplication.class, args);

	}
	
	//  http://localhost:8080/payment?cardNumber=1234&cvv=123

	@GetMapping
	public String validatePaymentDetails(@RequestParam String cardNumber, @RequestParam String cvv) throws Exception {
		System.out.println(".....Entered into validatePaymnetDetails.....");
		
		if (cardNumber.equals(paymentInfo.get(cardNumber)) && cvv.equals(paymentInfo.get(cvv))) {

			// OTP generate logic

			return "OTP sent  to the  registered mobile Number";
		} else {
			throw new Exception("Invalid cardNumber or cvv");
		}

	}

	@GetMapping
	public void validateOTP(@RequestParam String otp) {
		
		if(otp.equals("1234")) {
			// If success , check balance and deduct amount from user account.
			
		}

		
	}

}
