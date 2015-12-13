package com.yash.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.view.RedirectView;

@Component(value="maintenanceInterceptor")
public class MaintenanceInterceptor extends HandlerInterceptorAdapter{
	 static int i;
	
	//before the actual handler will be executed
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler)
	    throws Exception {
 
		System.out.println("in interceptors");
		request.getRequestURI();
		request.getRequestURL();
		 
		  if(request.getRequestURI().equals("/springjsppoc/ch")){
			
			response.sendRedirect("/springjsppoc/interceptor");
			
			return false;
		  }
			//request.getRequestDispatcher("/interceptor").forward(request, response);
		
		
			return true;
		
 
	}
}