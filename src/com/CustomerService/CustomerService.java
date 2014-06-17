
package com.CustomerService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "customerService", targetNamespace = "http://com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.CustomerService.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomer", targetNamespace = "http://com/", className = "com.CustomerService.GetCustomer")
    @ResponseWrapper(localName = "getCustomerResponse", targetNamespace = "http://com/", className = "com.CustomerService.GetCustomerResponse")
    public Customer getCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns com.CustomerService.GetCustomerListResponse.Return
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomerList", targetNamespace = "http://com/", className = "com.CustomerService.GetCustomerList")
    @ResponseWrapper(localName = "getCustomerListResponse", targetNamespace = "http://com/", className = "com.CustomerService.GetCustomerListResponse")
    public com.CustomerService.GetCustomerListResponse.Return getCustomerList();

}
