/**
 * People.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package introsde.assignment.soap.ws;

public interface People extends java.rmi.Remote {
    public java.lang.Long createPerson(introsde.assignment.soap.ws.PersonBean person) throws java.rmi.RemoteException;
    public introsde.assignment.soap.ws.PersonBean readPerson(java.lang.Long personId) throws java.rmi.RemoteException;
    public introsde.assignment.soap.ws.PersonBean[] readPersonList() throws java.rmi.RemoteException;
    public java.lang.Long updatePerson(introsde.assignment.soap.ws.PersonBean person) throws java.rmi.RemoteException;
    public int deletePerson(java.lang.Long personId) throws java.rmi.RemoteException;
    public introsde.assignment.soap.ws.MeasureBean[] readPersonHistory(java.lang.Long personId, java.lang.String type) throws java.rmi.RemoteException;
    public java.lang.String[] readMeasureTypes() throws java.rmi.RemoteException;
    public introsde.assignment.soap.ws.MeasureBean[] readPersonMeasure(java.lang.Long personId, java.lang.String type, java.lang.Long mid) throws java.rmi.RemoteException;
    public java.lang.Long savePersonMeasure(java.lang.Long personId, introsde.assignment.soap.ws.MeasureBean measure) throws java.rmi.RemoteException;
    public java.lang.Long updatePersonMeasure(java.lang.Long personId, introsde.assignment.soap.ws.MeasureBean measure) throws java.rmi.RemoteException;
}
