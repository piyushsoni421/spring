package com.yash.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
	@RequestMapping("/hello1")
	public ModelAndView testException1() throws IOException{
		ModelAndView model = new ModelAndView();
		boolean exceptionFlag = true;
		if (exceptionFlag){
			throw new IOException("piyush");
		}
		model.setViewName("hello");
		return model;
	}
	@RequestMapping("/hello2")
	public String testException2() throws SQLException{
		boolean exceptionFlag = true;
		if (exceptionFlag){
			throw new SQLException();
		}
		return "hello";
	}
	
	/*@ExceptionHandler(IOException.class)
	public ModelAndView handleIOException(IOException e) {
		System.out.println("error");
		ModelAndView model = new ModelAndView();
		model.addObject("name", e.getClass().getSimpleName());
		model.addObject("message", e.getMessage());
		model.setViewName("error");
		return model;
 
	}*/
}