package com.ssnapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssnapp.bindingobject.UserRequestBo;
import com.ssnapp.service.SsnService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("This is ssn generator")
@RestController
public class SSNGenController {

	@Autowired
	SsnService ssnService;

	@ApiOperation("This method to produce ssn number for citizen")
	@PostMapping(value = "/geneateSSN", consumes = { "application/json", "application/xml" },

			produces = { "application/json", "application/xml" })

	public ResponseEntity<String> handleEnrollmentButton(@RequestBody UserRequestBo userReqObj) {
		String generateSsnNumber = ssnService.generateSsnNumber(userReqObj);
		return new ResponseEntity<>(generateSsnNumber, HttpStatus.CREATED);
	}
}
