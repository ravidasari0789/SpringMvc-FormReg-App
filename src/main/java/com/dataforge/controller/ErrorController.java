package com.dataforge.controller;

import java.time.LocalDate;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {

	
	          @ExceptionHandler(value=Exception.class)
	          public String handletheException(ArithmeticException ex,Model model) {
	        	     model.addAttribute("exreg", ex.getMessage());
	        	     model.addAttribute("update", LocalDate.now());
	        	  
	        	  return "error";
	          }
}
