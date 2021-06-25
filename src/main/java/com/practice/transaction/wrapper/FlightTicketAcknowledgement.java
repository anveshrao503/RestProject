package com.practice.transaction.wrapper;

import com.practice.transaction.entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightTicketAcknowledgement {
	
	private String status;
	
	private String pnr;
	
	private PassengerInfo passengerInfo;

}
