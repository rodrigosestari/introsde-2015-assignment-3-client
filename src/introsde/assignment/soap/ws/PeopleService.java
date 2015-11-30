/**
 * PeopleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package introsde.assignment.soap.ws;

public interface PeopleService extends javax.xml.rpc.Service {
    public java.lang.String getPeopleImplPortAddress();

    public introsde.assignment.soap.ws.People getPeopleImplPort() throws javax.xml.rpc.ServiceException;

    public introsde.assignment.soap.ws.People getPeopleImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
