package com.ssnapp.bindingobject;

import java.sql.Blob;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement // This annotation is for accept xml format
public class UserRequestBo {
	
	private String firstName;

	private String lastName;

	private Character gender;

	private String state;
	
	private Date dob;
	
	private Blob photo;
	
}
