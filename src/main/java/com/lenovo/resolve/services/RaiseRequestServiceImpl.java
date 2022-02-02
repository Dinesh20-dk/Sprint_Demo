package com.lenovo.resolve.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lenovo.resolve.entity.RaiseRequestEntity;
import com.lenovo.resolve.model.RaiseRequest;
import com.lenovo.resolve.repository.RaiseRequestRepository;

@Service
public class RaiseRequestServiceImpl implements RaiseRequestService{
	
	@Autowired
	RaiseRequestRepository raiseRequestRepo;

	@Override
	public List<RaiseRequestEntity> getTicketDetails() {
		// TODO Auto-generated method stub
		return raiseRequestRepo.findAll();
	}

	

	@Override
	public RaiseRequestEntity findById(String ticketNumber) {
		// TODO Auto-generated method stub
		return raiseRequestRepo.findByCsdtTicketNumber(ticketNumber);
	}

	@Override
	public RaiseRequestEntity saveTicket(RaiseRequest raiseRequest) {
		// TODO Auto-generated method stub
		RaiseRequestEntity raiseRequestEntity = new RaiseRequestEntity();
		String ticketNumber = generateTicket(raiseRequest.getCaseType(),raiseRequest.getCountryCode());
		raiseRequestEntity.setCsdtTicketNumber(ticketNumber);
		raiseRequestEntity.setCsdtSoNo(raiseRequest.getSoNumber());
		raiseRequestEntity.setCsdtMachineSerialNumber(raiseRequest.getMachineSerialNumber());
		raiseRequestEntity.setCsdtMachineType("Lenovo");
		raiseRequestEntity.setCsdtModel(raiseRequest.getModel());
		raiseRequestEntity.setCsdtRequestedBy(raiseRequest.getRequestBy());
		raiseRequestEntity.setCsdtRequestDate(new Date());
		raiseRequestEntity.setCsdtRegion(raiseRequest.getRegion());
		raiseRequestEntity.setCsdtCountryCode(raiseRequest.getCountryCode());
		raiseRequestEntity.setCsdtCity(raiseRequest.getCity());
		raiseRequestEntity.setCsdtStatus("Open");
		raiseRequestEntity.setCsdtLob(raiseRequest.getLob());
		raiseRequestEntity.setCsdtFlowType(raiseRequest.getFlowType());
		raiseRequestEntity.setCsdtSystemType(raiseRequest.getSystemType());
		raiseRequestEntity.setCsdtCaseStatus("Pending");
		raiseRequestEntity.setCsdtCaseType(raiseRequest.getCaseType());
		raiseRequestEntity.setCsdtTrexStatus("Open");
		return raiseRequestRepo.save(raiseRequestEntity);
	}

	@Override
	public RaiseRequestEntity updateTicket(RaiseRequest raiseRequest) {
		// TODO Auto-generated method stub
		RaiseRequestEntity raiseRequestEntity = new RaiseRequestEntity();
		raiseRequestEntity.setCsdtTicketNumber(raiseRequest.getTicketNumber());
		raiseRequestEntity.setCsdtSoNo(raiseRequest.getSoNumber());
		raiseRequestEntity.setCsdtMachineSerialNumber(raiseRequest.getMachineSerialNumber());
		raiseRequestEntity.setCsdtMachineType("Lenovo");
		raiseRequestEntity.setCsdtModel(raiseRequest.getModel());
		raiseRequestEntity.setCsdtRequestedBy(raiseRequest.getRequestBy());
		raiseRequestEntity.setCsdtRequestDate(new Date());
		raiseRequestEntity.setCsdtRegion(raiseRequest.getRegion());
		raiseRequestEntity.setCsdtCountryCode(raiseRequest.getCountryCode());
		raiseRequestEntity.setCsdtCity(raiseRequest.getCity());
		raiseRequestEntity.setCsdtStatus("Open");
		raiseRequestEntity.setCsdtLob(raiseRequest.getLob());
		raiseRequestEntity.setCsdtFlowType(raiseRequest.getFlowType());
		raiseRequestEntity.setCsdtSystemType(raiseRequest.getSystemType());
		raiseRequestEntity.setCsdtCaseStatus("Pending");
		raiseRequestEntity.setCsdtCaseType(raiseRequest.getCaseType());
		raiseRequestEntity.setCsdtTrexStatus("Open");
		return  raiseRequestRepo.save(raiseRequestEntity);
	}

	@Override
	public void deleteByTicketNumber(String ticketNumber) {
		// TODO Auto-generated method stub
		raiseRequestRepo.deleteByCsdtTicketNumber(ticketNumber);
	}
	
	public String generateTicket(String caseType, String countryType) {
		String generator = caseType.substring(0, 1) + new SimpleDateFormat("yyMMmmss").format(new Date())
				+ countryType.substring(0, 2).toUpperCase() + (100 + new Random().nextInt(9000));
		return generator;
	}

}
