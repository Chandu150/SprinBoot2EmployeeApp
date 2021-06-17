package com.app.Employee.customexceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.Employee.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class CustomExceptionhandler {
	
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> handleEmployeeNotFound(
			EmployeeNotFoundException enfe)
	{
		return new ResponseEntity<String>(enfe.getMessage(),HttpStatus.NOT_FOUND);
	}

}
