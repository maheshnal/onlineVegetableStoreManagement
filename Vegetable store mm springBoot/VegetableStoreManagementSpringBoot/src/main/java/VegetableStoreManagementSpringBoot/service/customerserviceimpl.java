package VegetableStoreManagementSpringBoot.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VegetableStoreManagementSpringBoot.entity.customer;
import VegetableStoreManagementSpringBoot.repository.customerRepository;

@Service

public class customerserviceimpl implements customerService {
	
	@Autowired
	private customerRepository cRepo;
	
	@Override
	
	public customer insertcustomer(customer newcustomer) {
		long generatecustomerid = 0;
		newcustomer.setCustomerId(generatecustomerid);
		return newcustomer;
		
	}
	
	 public void generatecustomerId() {
		Random rand=new Random();
		
		int upperbound=255;
		long cid=(long)rand.nextInt(upperbound);
		 
	 }

}
