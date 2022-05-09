package com.bikkadIT.tikitcontroller;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIT.model.Customer;
import com.bikkadIT.model.TikitAdmin;
import com.bikkadIT.serviceImpl.TicketService;

@RestController

public class AdminController {
	@Autowired
	private TicketService ticketService;
	
	
	@PostMapping(value = "/bookTicket",consumes ={"application/json","application/xml"},
			produces = {"application/json","application/xml"})
	public ResponseEntity<TikitAdmin> tikitGen(@RequestBody Customer customer){
		
		
		ticketService.getCustomer(customer);
		
		TikitAdmin genTicket = ticketService.genTicket();
		
		return new ResponseEntity<TikitAdmin>(genTicket,HttpStatus.OK);
		
		
		
	}
	

}
