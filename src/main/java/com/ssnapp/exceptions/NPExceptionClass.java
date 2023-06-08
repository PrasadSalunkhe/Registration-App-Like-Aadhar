package com.ssnapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Controller
@ControllerAdvice
public class NPExceptionClass {

	// in case of web mvc we can write like this
//	@ExceptionHandler(value=NullPointerException.class)
//	public String handleNPE(Model model) {
//		model.addAttribute("errMsg","Something wrong");
//		return "errPage";
//	} 
	
	// for Spring rest apps
	@ExceptionHandler(value=NullPointerException.class)
	public ResponseEntity ssnDataNotFoundeException() {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	} 
}
