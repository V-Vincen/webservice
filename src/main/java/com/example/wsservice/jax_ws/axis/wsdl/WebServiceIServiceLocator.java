/**
 * WebServiceIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.wsservice.jax_ws.axis.wsdl;

public class WebServiceIServiceLocator extends org.apache.axis.client.Service implements com.example.wsservice.jax_ws.axis.wsdl.WebServiceIService {

    public WebServiceIServiceLocator() {
    }


    public WebServiceIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceIPort
    private java.lang.String WebServiceIPort_address = "http://127.0.0.1:8989/webservice/cxf";

    public java.lang.String getWebServiceIPortAddress() {
        return WebServiceIPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceIPortWSDDServiceName = "WebServiceIPort";

    public java.lang.String getWebServiceIPortWSDDServiceName() {
        return WebServiceIPortWSDDServiceName;
    }

    public void setWebServiceIPortWSDDServiceName(java.lang.String name) {
        WebServiceIPortWSDDServiceName = name;
    }

    public com.example.wsservice.jax_ws.axis.wsdl.WebServiceI getWebServiceIPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceIPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceIPort(endpoint);
    }

    public com.example.wsservice.jax_ws.axis.wsdl.WebServiceI getWebServiceIPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.wsservice.jax_ws.axis.wsdl.WebServiceIServiceSoapBindingStub _stub = new com.example.wsservice.jax_ws.axis.wsdl.WebServiceIServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWebServiceIPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceIPortEndpointAddress(java.lang.String address) {
        WebServiceIPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.wsservice.jax_ws.axis.wsdl.WebServiceI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.wsservice.jax_ws.axis.wsdl.WebServiceIServiceSoapBindingStub _stub = new com.example.wsservice.jax_ws.axis.wsdl.WebServiceIServiceSoapBindingStub(new java.net.URL(WebServiceIPort_address), this);
                _stub.setPortName(getWebServiceIPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServiceIPort".equals(inputPortName)) {
            return getWebServiceIPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.cxf.wsservice.example.com/", "WebServiceIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.cxf.wsservice.example.com/", "WebServiceIPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceIPort".equals(portName)) {
            setWebServiceIPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
