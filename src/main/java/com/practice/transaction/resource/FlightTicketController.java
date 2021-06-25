package com.practice.transaction.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.transaction.service.FlightTicketService;
import com.practice.transaction.wrapper.FlightTicketAcknowledgement;
import com.practice.transaction.wrapper.FlightTicketRequest;

@RestController
@RequestMapping("/FlgTck")
public class FlightTicketController {
	
	@Autowired
	protected FlightTicketService ticketService;
	
	@PostMapping(value = "/purchaseTicket" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public FlightTicketAcknowledgement purchaseTicket(@RequestBody FlightTicketRequest ticketrRequest) {
		
		return ticketService.bookFlight(ticketrRequest);
		
	}

}
