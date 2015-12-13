package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.service.JspService;
import com.yash.service.Label;

@Controller("controller")
public class Handler {

	@Autowired
	JspService excelfileservice;

	@Autowired
	Label label;
	
	public String baseUrl;

	private String[] dealeridcitylist;

	
	public String[] getDealeridcitylist() {
		return dealeridcitylist;
	}

	public void setDealeridcitylist(String[] dealeridcitylist) {
		this.dealeridcitylist = dealeridcitylist;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	int i=10;

	@RequestMapping("/")
	public String welcomeRedirect(Model model) {
		label.setLabelId(10);
		label.setLabelName("jdms");
		label.setEuRegion(true);
		this.setLabel(label);
		String[] a={"A","B"};
		this.setDealeridcitylist(a);
		model.addAttribute("appBean",this);
		System.out.println("in success");
		return "success";
	}
	@RequestMapping(value="interceptor", method=RequestMethod.GET)
	public String intercept() {
		System.out.println("in intercept");
		return "comment";
	}
	@RequestMapping(value="ch", method=RequestMethod.GET)
	public String intercepts() {
		System.out.println("in intercept");
		return "interceptor";
	}
	
}