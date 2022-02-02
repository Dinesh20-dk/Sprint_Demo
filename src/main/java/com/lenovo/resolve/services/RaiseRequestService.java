package com.lenovo.resolve.services;

import java.util.List;

import com.lenovo.resolve.entity.RaiseRequestEntity;
import com.lenovo.resolve.model.RaiseRequest;


public interface RaiseRequestService {

	public List<RaiseRequestEntity> getTicketDetails();
	
	public RaiseRequestEntity findById(String ticketNumber);
	
	public RaiseRequestEntity saveTicket(RaiseRequest raiseRequest);
	
	public RaiseRequestEntity updateTicket(RaiseRequest raiseRequest);
	
	public void deleteByTicketNumber(String ticketNumber);
}
