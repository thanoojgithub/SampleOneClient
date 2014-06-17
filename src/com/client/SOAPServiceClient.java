package com.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.CustomerService.CustomerService;
import com.CustomerService.CustomerServiceService;
import com.CustomerService.GetCustomerListResponse;
import com.EmployeeService.EmployeeService;
import com.EmployeeService.EmployeeServiceService;
import com.EmployeeService.GetEmployeeListResponse;


public class SOAPServiceClient {
	static final Logger logger = Logger.getLogger(SOAPServiceClient.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("../SampleOneClient/recources/log4j.properties");
		tracingSOAPReqEmp();
		empployeeServiceSOAP();
		tracingSOAPReqCust();
		customerServiceSOAP();
	}

	
	public static void tracingSOAPReqEmp() {
		logger.trace("Using URL, QName, Service, Port :: Employee");
		URL url = null;
		try {
			url = new URL("http://localhost:8080/SampleOne-0.0.1-SNAPSHOT/emp?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	    QName qname = new QName("http://com/", "EmployeeServiceService");
	    Service service = Service.create(url, qname);
	 
	    EmployeeService employeeService = service.getPort(EmployeeService.class);
	    EmployeePOJO employee = new EmployeePOJO(employeeService.getEmployee().getEId(), employeeService.getEmployee().getEName());
	    logger.trace(employee);
	} 

	public static void  empployeeServiceSOAP() {
		logger.trace("Using getEmployeeServicePort :: Employee");
		EmployeeServiceService employeeServiceService = new EmployeeServiceService();
		EmployeeService employeeService = employeeServiceService.getEmployeeServicePort();
		com.EmployeeService.Employee employeeReturn = employeeService.getEmployee();
		EmployeePOJO employee1 = new EmployeePOJO(employeeReturn.getEId(), employeeReturn.getEName());
		logger.trace(employee1);
		GetEmployeeListResponse.Return employeeListReturn = employeeService.getEmployeeList();
		List<com.EmployeeService.Employee> employeeList= employeeListReturn.getEmployee();
		for (com.EmployeeService.Employee emp : employeeList){
			EmployeePOJO employee2 = new EmployeePOJO(emp.getEId(),emp.getEName());
			logger.trace("employeeList : "+employee2);
		}
	}
	
	public static void tracingSOAPReqCust() {
		logger.trace("------------------------------------------------------------------");
		logger.trace("Using URL, QName, Service, Port :: Customer");
		URL url = null;
		try {
			url = new URL("http://localhost:8080/SampleOne-0.0.1-SNAPSHOT/cust?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	    QName qname = new QName("http://com/", "CustomerServiceService");
	    Service service = Service.create(url, qname);
	 
	    CustomerService customerService = service.getPort(CustomerService.class);
	    CustomerPOJO customer = new CustomerPOJO(customerService.getCustomer(1).getCId(), customerService.getCustomer(1).getCName());
	    logger.trace(customer);
	} 

	public static void  customerServiceSOAP() {
		logger.trace("Using getCustomerServicePort :: Customer");
		CustomerServiceService customerServiceService = new CustomerServiceService();
		CustomerService customerService = customerServiceService.getCustomerServicePort();
		com.CustomerService.Customer customerReturn = customerService.getCustomer(11);
		CustomerPOJO customer1 = new CustomerPOJO(customerReturn.getCId(), customerReturn.getCName());
		logger.trace(customer1);
		GetCustomerListResponse.Return customerListReturn = customerService.getCustomerList();
		List<com.CustomerService.Customer> customerList= customerListReturn.getCustomer();
		for (com.CustomerService.Customer cust : customerList){
			CustomerPOJO customer2 = new CustomerPOJO(cust.getCId(),cust.getCName());
			logger.trace("customerList : "+customer2);
		}
	}
}