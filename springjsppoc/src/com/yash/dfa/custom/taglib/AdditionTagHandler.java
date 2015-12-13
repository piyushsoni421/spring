package com.yash.dfa.custom.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;



public class AdditionTagHandler  extends TagSupport {

	public int first;
	
	public int second;

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	  @Override 
	    public int doStartTag() throws JspException {
	         
	        try {
	            //Get the writer object for output.
	            JspWriter out = pageContext.getOut();
	          int c=first+second;
	          String m="this 'is' messages's link.";
	            //Perform substr operation on string.
	        // out.println("\""+m+"\"");
	     out.write(m);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return SKIP_BODY;
	    }
}
