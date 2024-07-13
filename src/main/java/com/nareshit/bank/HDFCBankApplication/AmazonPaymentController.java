package com.nareshit.bank.HDFCBankApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/payment")
public class AmazonPaymentController {

	@RequestMapping(value="/gpay")
	public String getGooglePayment() {
		return "Google Payment Section";
	}
	
	@RequestMapping(value="/creditcard")
	public String getCreditCard() {
		return "Credit Card Section";
	}
	
	@RequestMapping(value="/cod")
	public String getCashOnDelivery() {
		return "Cash On Delivery";
	}
	
	@RequestMapping(value="/giftcard")
	public String getGiftCard() {
		return "Gift Card Section";
	}
}
