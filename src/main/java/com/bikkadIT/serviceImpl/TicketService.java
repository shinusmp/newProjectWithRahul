package com.bikkadIT.serviceImpl;

import org.springframework.stereotype.Service;

import com.bikkadIT.model.Customer;
import com.bikkadIT.model.TikitAdmin;

@Service
public class TicketService {
	
	public void getCustomer(Customer customer) {
		
	System.out.println(customer);
		
	}
	
	
	public TikitAdmin genTicket() {
		//TikitAdmin tikitAdmin=new TikitAdmin();
		
		
		
		return new TikitAdmin(73388355,"confirmed",415.20) ;
	}

}
