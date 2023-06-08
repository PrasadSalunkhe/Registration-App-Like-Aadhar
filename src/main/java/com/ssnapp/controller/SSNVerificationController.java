package com.ssnapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ssnapp.bindingobject.UserResponceBo;
import com.ssnapp.service.SsnService;

@RestController
public class SSNVerificationController {
	@Autowired
	SsnService ssnService;
	
	@GetMapping("/getCitizenDetails/{ssn}")
	public ResponseEntity<UserResponceBo> handleSSNSubmitBtn(@PathVariable("ssn") Long ssn ){
		UserResponceBo responceObj = (UserResponceBo) ssnService.verifyCitizenBySSN(ssn);
		return new ResponseEntity<>(responceObj,HttpStatus.OK);
	}
	

}
