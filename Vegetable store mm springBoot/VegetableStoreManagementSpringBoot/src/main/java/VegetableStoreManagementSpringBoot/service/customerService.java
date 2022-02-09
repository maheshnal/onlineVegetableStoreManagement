package VegetableStoreManagementSpringBoot.service;

import org.springframework.stereotype.Service;

import VegetableStoreManagementSpringBoot.entity.customer;

@Service

public interface customerService {

	customer insertcustomer(customer newcustomer);

	
	
}
