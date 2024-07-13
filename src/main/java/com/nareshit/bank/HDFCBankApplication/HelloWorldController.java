package com.nareshit.bank.HDFCBankApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String gethelloworld() {
		return "Welcome To Spring Initializer";
		
	}

}
