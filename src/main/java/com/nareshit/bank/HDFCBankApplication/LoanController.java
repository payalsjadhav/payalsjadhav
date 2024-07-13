package com.nareshit.bank.HDFCBankApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/loan")
public class LoanController {

	@RequestMapping(value="/home")
	public String getHomeLoan() {
		return "Home Loan Section";
	}
	
	@RequestMapping(value="/personal")
	public String getPersonalLoan() {
		return "personal Loan Section";
	}
	
	@RequestMapping(value="/vehicle")
	public String getvehicleLoan() {
		return "vehicle Loan Section";
	}
}
