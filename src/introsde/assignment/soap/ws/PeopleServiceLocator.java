/**
 * PeopleServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package introsde.assignment.soap.ws;

public class PeopleServiceLocator extends org.apache.axis.client.Service implements introsde.assignment.soap.ws.PeopleService {

    public PeopleServiceLocator() {
    }


    public PeopleServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PeopleServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PeopleImplPort
    private java.lang.String PeopleImplPort_address = "http://rodrigo-sestari-soap-server.herokuapp.com/ws/people";

    public java.lang.String getPeopleImplPortAddress() {
        return PeopleImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PeopleImplPortWSDDServiceName = "PeopleImplPort";

    public java.lang.String getPeopleImplPortWSDDServiceName() {
        return PeopleImplPortWSDDServiceName;
    }

    public void setPeopleImplPortWSDDServiceName(java.lang.String name) {
        PeopleImplPortWSDDServiceName = name;
    }

    public introsde.assignment.soap.ws.People getPeopleImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PeopleImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPeopleImplPort(endpoint);
    }

    public introsde.assignment.soap.ws.People getPeopleImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            introsde.assignment.soap.ws.PeopleImplPortBindingStub _stub = new introsde.assignment.soap.ws.PeopleImplPortBindingStub(portAddress, this);
            _stub.setPortName(getPeopleImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPeopleImplPortEndpointAddress(java.lang.String address) {
        PeopleImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (introsde.assignment.soap.ws.People.class.isAssignableFrom(serviceEndpointInterface)) {
                introsde.assignment.soap.ws.PeopleImplPortBindingStub _stub = new introsde.assignment.soap.ws.PeopleImplPortBindingStub(new java.net.URL(PeopleImplPort_address), this);
                _stub.setPortName(getPeopleImplPortWSDDServiceName());
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
        if ("PeopleImplPort".equals(inputPortName)) {
            return getPeopleImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.soap.assignment.introsde/", "PeopleService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.soap.assignment.introsde/", "PeopleImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PeopleImplPort".equals(portName)) {
            setPeopleImplPortEndpointAddress(address);
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
