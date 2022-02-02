package com.lenovo.resolve.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_rsvl_usrlogin")
public class UserLoginEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "usrlg_username")
	private String username;
	@Column(name = "usrlg_userpasswd")
	private String password;
	@Column(name = "usrlg_accttype")
	private String accountType;
	@Column(name = "usrlg_supptype")
	private String suppType;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSuppType() {
		return suppType;
	}

	public void setSuppType(String suppType) {
		this.suppType = suppType;
	}

	
}
