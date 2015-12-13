package com.yash.mapping;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

public class Mapper {

	
	public void beanMapper(Object obj1,Object obj2){
		Method[] allMethods =  obj1.getClass().getMethods();
		List<Method> setters = new ArrayList<Method>();
		for(Method method : allMethods) {
		    if(method.getName().startsWith("set")) {
		        setters.add(method);
		    }
		}
		System.out.println(setters);
		Field m[]=obj1.getClass().getFields();
		List<Field> fields = new ArrayList<Field>();
		for(Field field : m) {
		    
		  System.out.println(field);
		}
	}
	
	public static void main(String[] args) {
		Mapper mapper =new Mapper();
		Form1 form1 = new Form1();
		Form2 form2 = new Form2();
		
		form1.setId(1);
		form1.setName("piyush");
		form1.setAddress("Piyush");
		form1.setNn("ss");
		try {
			BeanUtils.copyProperties(form2, form1);
			
			System.out.println(form2.getId());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
