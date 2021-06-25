package com.practice.transaction.wrapper;

import com.practice.transaction.entity.PassengerInfo;
import com.practice.transaction.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightTicketRequest {
	
	public PassengerInfo passengerInfo;
	
	public PaymentInfo paymentInfo;

}
