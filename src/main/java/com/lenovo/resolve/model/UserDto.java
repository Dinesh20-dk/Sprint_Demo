package com.lenovo.resolve.model;

import io.swagger.annotations.ApiModelProperty;

public class UserDto {
	@ApiModelProperty(notes = "Username for Login",name="username",required=true,value="resolve")
    private String username;
	@ApiModelProperty(notes = "Password for Login",name="password",required=true,value="********")
    private String password;

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

	public UserDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public UserDto() {
		super();
		
	}


    
    
}
