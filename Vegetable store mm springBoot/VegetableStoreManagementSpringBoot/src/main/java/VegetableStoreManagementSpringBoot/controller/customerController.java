package VegetableStoreManagementSpringBoot.controller;

import org.hibernate.boot.registry.classloading.spi.ClassLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import VegetableStoreManagementSpringBoot.entity.customer;

@RestController//(@Controller+@ResponseBody)

@RequestMapping("customer/api/v1")
public class customerController {

	@Autowired
	ClassLoaderService customerService;
	
	@PostMapping
	
	public customer insertcustomer(@RequestBody customer newCustomer) {
		return  newCustomer;
		
		
	}
	
}
