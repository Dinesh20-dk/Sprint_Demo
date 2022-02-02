package com.lenovo.resolve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenovo.resolve.entity.RaiseRequestEntity;

@Repository
public interface RaiseRequestRepository extends JpaRepository<RaiseRequestEntity, String> {

	public RaiseRequestEntity findByCsdtTicketNumber(String ticketNumber);

	public void deleteByCsdtTicketNumber(String ticketNumber);

}
