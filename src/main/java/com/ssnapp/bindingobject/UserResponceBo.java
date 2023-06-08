package com.ssnapp.bindingobject;

import java.util.Date;

import lombok.Data;

@Data
public class UserResponceBo {


	private Long ssnId;
	
	private String firstName;

	private String lastName;

	private Character gender;

	private String state;
	
	private Date dob;
}
