
package com.CustomerService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.CustomerService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCustomerResponse_QNAME = new QName("http://com/", "getCustomerResponse");
    private final static QName _GetCustomer_QNAME = new QName("http://com/", "getCustomer");
    private final static QName _GetCustomerListResponse_QNAME = new QName("http://com/", "getCustomerListResponse");
    private final static QName _GetCustomerList_QNAME = new QName("http://com/", "getCustomerList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.CustomerService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerListResponse }
     * 
     */
    public GetCustomerListResponse createGetCustomerListResponse() {
        return new GetCustomerListResponse();
    }

    /**
     * Create an instance of {@link CustomerList }
     * 
     */
    public CustomerList createCustomerList() {
        return new CustomerList();
    }

    /**
     * Create an instance of {@link GetCustomerListResponse.Return }
     * 
     */
    public GetCustomerListResponse.Return createGetCustomerListResponseReturn() {
        return new GetCustomerListResponse.Return();
    }

    /**
     * Create an instance of {@link GetCustomerList }
     * 
     */
    public GetCustomerList createGetCustomerList() {
        return new GetCustomerList();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getCustomerResponse")
    public JAXBElement<GetCustomerResponse> createGetCustomerResponse(GetCustomerResponse value) {
        return new JAXBElement<GetCustomerResponse>(_GetCustomerResponse_QNAME, GetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getCustomer")
    public JAXBElement<GetCustomer> createGetCustomer(GetCustomer value) {
        return new JAXBElement<GetCustomer>(_GetCustomer_QNAME, GetCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getCustomerListResponse")
    public JAXBElement<GetCustomerListResponse> createGetCustomerListResponse(GetCustomerListResponse value) {
        return new JAXBElement<GetCustomerListResponse>(_GetCustomerListResponse_QNAME, GetCustomerListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getCustomerList")
    public JAXBElement<GetCustomerList> createGetCustomerList(GetCustomerList value) {
        return new JAXBElement<GetCustomerList>(_GetCustomerList_QNAME, GetCustomerList.class, null, value);
    }

}
