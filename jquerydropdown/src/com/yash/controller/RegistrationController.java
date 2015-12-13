package com.yash.controller;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yash.form.City;
import com.yash.form.State;
import com.yash.service.GeoService;



/**
 * @author gene
 * 
 */
@Controller
public class RegistrationController {

	private static final Logger logger = LoggerFactory
			.getLogger(RegistrationController.class);

	@Autowired
	private GeoService geoService;
	
	

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String get(Model model) {
		SignupForm form = new SignupForm();
		model.addAttribute("signupForm", form);
		logger.debug("registering. added form to model and returning register page");
		return "register";
	}

	@RequestMapping(value = "/cities", method = RequestMethod.GET)
	public @ResponseBody
	Set<City> citiesForState(
			@RequestParam(value = "stateName", required = true) String state) {
		logger.debug("finding cities for state " + state);
		return this.geoService.findCitiesForState(state);
	}

	@RequestMapping(value = "/states", method = RequestMethod.GET)
	public @ResponseBody
	Set<State> findAllStates() {
		logger.debug("finding all states");
		return this.geoService.findAllStates();
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@ModelAttribute("signupForm") SignupForm form,
			BindingResult result) {
		logger.debug("siging up " + form);
		return "account";
	}
	@RequestMapping(value = "/test1")
	public ModelAndView test1(){
		ModelAndView mv =new ModelAndView();
		mv.setViewName("test1");
		return mv;
	}
	
	@RequestMapping(value = "/products_ajax", method = RequestMethod.GET)
	   public @ResponseBody
	   List<City> productsForCategory(
	     @RequestParam(value = "categoryId", required = true) Integer categoryId) throws IllegalStateException {
	 City cityList =new City();
	  //Change this as per you requirement to generate values according to business logics 
	  
	  
	   cityList.setName("Pune");
	   List l= new ArrayList();
	   l.add(cityList);
	  //Specify the returning object you want here
	    return l;
	   }
}
