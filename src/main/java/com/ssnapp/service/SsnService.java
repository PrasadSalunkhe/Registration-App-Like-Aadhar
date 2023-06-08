package com.ssnapp.service;

import com.ssnapp.bindingobject.UserRequestBo;

public interface SsnService {

	public String generateSsnNumber(UserRequestBo user);
	
	public Object verifyCitizenBySSN(Long ssn); 
}
