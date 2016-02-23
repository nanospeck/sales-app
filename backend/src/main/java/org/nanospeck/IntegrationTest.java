package org.nanospeck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntegrationTest {
	    public static void main(String[] args) 
	    {
	        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
	 
	        //EmployeeManager manager = (EmployeeManager) context.getBean(EmployeeManager.class);
	         
	        //OR this will also work
	         
	       // EmployeeController controller = (EmployeeController) context.getBean("employeeController");
	         
	    }
}
