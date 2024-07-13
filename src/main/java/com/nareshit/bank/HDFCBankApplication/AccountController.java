package com.nareshit.bank.HDFCBankApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Class Level RequestMapping + Method Level RequestMapping ==> Unique
//http://localhost:8080 ==> DEfault Path

@RestController //It will registered with Dispatcher Servlet
@RequestMapping(value="/account") //http://localhost:8080/account

//http://localhost:8080/accont ==> AccountController obj=ioc.getAccountController();
public class AccountController {
	
	//we are going to register all methods also to dispatcher servlet
	@RequestMapping(value="/savings") //http://localhost:8080/account/savings
	//http://localhost:8080/account/savings ==> obj.getSavingsAccount();
	public String getSavingsAccount() {
		return "Saving Account Module";
	}
	
	@RequestMapping(value="/current") //http://localhost:8080/account/current
	//http://localhost:8080/account/current ==>obj.getCurrentAccount();
	public String getCurrentAccount() {
		return "Current Account Module";
	}
	
	@RequestMapping(value="/fd") //http://localhost:8080/account/fd
	//http://localhost:8080/account/fd ==> obj.getFixedDepositAccount();
	public String getFixedDepositAccount() {
		return "Fixed Deposit Account";
	}

}
