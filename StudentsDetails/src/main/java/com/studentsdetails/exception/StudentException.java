package com.studentsdetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentException {

@ExceptionHandler(AgeException.class)
public ResponseEntity<Object> belowAge() {
	return new ResponseEntity<>("Below 18 age not allowed: ",HttpStatus.NOT_FOUND);
}
}
