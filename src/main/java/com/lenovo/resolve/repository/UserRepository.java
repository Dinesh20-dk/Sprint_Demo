package com.lenovo.resolve.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenovo.resolve.entity.UserLoginEntity;



@Repository
public interface UserRepository extends JpaRepository<UserLoginEntity, String> {
	UserLoginEntity findByUsername(String username);
}