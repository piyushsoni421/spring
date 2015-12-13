package com.yash.exceptionhandling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;



@ControllerAdvice
public class ExceptionControllerAdvice {


	@ExceptionHandler(Exception.class)
	
	public ModelAndView handleIOException(Exception e) {
		System.out.println("error");
		ModelAndView model = new ModelAndView();
		model.addObject("name", e.getClass().getSimpleName());
		model.addObject("message", e.getMessage());
		model.setViewName("error");
		return model;
 
	}
}
