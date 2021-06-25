package com.practice.transaction.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.transaction.entity.PaymentInfo;
import com.practice.transaction.repository.PassengerInfoRepository;
import com.practice.transaction.repository.PaymentInfoRepository;
import com.practice.transaction.utils.exception.InsufficientFundsException;
import com.practice.transaction.wrapper.FlightTicketAcknowledgement;
import com.practice.transaction.wrapper.FlightTicketRequest;

@Service
public class FlightTicketService {

	@Autowired
	protected PassengerInfoRepository passengerInfoRepository;
	
	@Autowired
	protected PaymentInfoRepository paymentInfoRepository;
	
	@Transactional(readOnly = false)
	public FlightTicketAcknowledgement bookFlight(FlightTicketRequest request) {
		
		FlightTicketAcknowledgement acknowledgement=null;
		
		passengerInfoRepository.save(request.getPassengerInfo());
		
		PaymentInfo paymentInfo=request.getPaymentInfo();
		paymentInfo.setPassengerId(request.getPassengerInfo().getId());
		paymentInfo.setAccAmt(request.getPassengerInfo().getFare());
		
		if(request.getPassengerInfo().getFare()< 15000.00) {
			throw new InsufficientFundsException("account funds are not sufficient for ticket purchase");
		}
		
		paymentInfoRepository.save(paymentInfo);
		
		return new FlightTicketAcknowledgement("SUCCESS",UUID.randomUUID().toString() , request.getPassengerInfo());
		
	}
}
