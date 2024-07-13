package com.nareshit.bank.HDFCBankApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/product")
public class AmazonProductController {
	
	@RequestMapping(value="/add")
	public String getAddProduct() {
		return "Add Product";
	}
	
	@GetMapping(value="/get")
	public String getProduct() {
		return "Get Product";
	}
	
	
	@RequestMapping(value="/update")
	public String getUpdateProduct() {
		return "Update Product";
	}
	
	@RequestMapping(value="/delete")
	public String getDeleteProduct() {
		return "Delete Product";
	}
	

}
