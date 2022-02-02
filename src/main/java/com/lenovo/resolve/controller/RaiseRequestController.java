package com.lenovo.resolve.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lenovo.resolve.entity.RaiseRequestEntity;
import com.lenovo.resolve.model.RaiseRequest;
import com.lenovo.resolve.services.RaiseRequestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/raiseRequest")
@Api(value = "Raise Request", description = "Raise Request API for Resolve", tags = "Raise Request APIs")
public class RaiseRequestController {
	@Autowired
	RaiseRequestService raiseRequestService;
	// CRUD methods to be added

	@ApiOperation(value = "RaiseRequest Records", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })

	@GetMapping
	public List<RaiseRequestEntity> getAllRecords() {
		return raiseRequestService.getTicketDetails();
	}

	@GetMapping(value = "{ticketNumber}")
	public RaiseRequestEntity getDetailsByTicket(@PathVariable(value = "ticketNumber") String ticketNumber) {
		return raiseRequestService.findById(ticketNumber);
	}
	
	@ApiOperation(value = "Create RaiseRequest", response = RaiseRequestEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ticket Created Successfully"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })

	@PostMapping
	public RaiseRequestEntity createRecord(@RequestBody @Valid RaiseRequest raiseRequest) {
		return raiseRequestService.saveTicket(raiseRequest);
	}

	@PutMapping
	public RaiseRequestEntity updateTicketInformation(@RequestBody RaiseRequest raiseRequest) throws NotFoundException {

		return raiseRequestService.updateTicket(raiseRequest);
	}

	@DeleteMapping(value = "{ticketNumber}")
	public void deleteByTicketNumber(@PathVariable(value = "ticketNumber") String ticketNumber) throws NotFoundException {

		raiseRequestService.deleteByTicketNumber(ticketNumber);
	}
}