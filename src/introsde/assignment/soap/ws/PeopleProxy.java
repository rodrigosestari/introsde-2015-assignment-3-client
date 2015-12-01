package introsde.assignment.soap.ws;

public class PeopleProxy implements introsde.assignment.soap.ws.People {
  private String _endpoint = null;
  private introsde.assignment.soap.ws.People people = null;
  
  public PeopleProxy() {
    _initPeopleProxy();
  }
  
  public PeopleProxy(String endpoint) {
    _endpoint = endpoint;
    _initPeopleProxy();
  }
  
  private void _initPeopleProxy() {
    try {
      people = (new introsde.assignment.soap.ws.PeopleServiceLocator()).getPeopleImplPort();
      if (people != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)people)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)people)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (people != null)
      ((javax.xml.rpc.Stub)people)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public introsde.assignment.soap.ws.People getPeople() {
    if (people == null)
      _initPeopleProxy();
    return people;
  }
  
  public java.lang.Long createPerson(introsde.assignment.soap.bean.PersonBean person) throws java.rmi.RemoteException{
    if (people == null)
      _initPeopleProxy();
    return people.createPerson(person);
  }
  
  public introsde.assignment.soap.bean.PersonBean readPerson(java.lang.Long personId) throws java.rmi.RemoteException{
    if (people == null)
      _initPeopleProxy();
    return people.readPerson(personId);
  }
  
  public introsde.assignment.soap.bean.PersonBean[] readPersonList() throws java.rmi.RemoteException{
    if (people == null)
      _initPeopleProxy();
    return people.readPersonList();
  }
  
  public java.lang.Long updatePerson(introsde.assignment.soap.bean.PersonBean person) throws java.rmi.RemoteException{
    if (people == null)
      _initPeopleProxy();
    return people.updatePerson(person);
  }
  
  public int deletePerson(java.lang.Long personId) throws java.rmi.RemoteException{
    if (people == null)
      _initPeopleProxy();
    return people.deletePerson(personId);
  }
  
  public introsde.assignment.soap.bean.MeasureBean[] readPersonHistory(java.lang.Long personId, java.lang.String type) throws java.rmi.RemoteException{
    if (people == null)
      _initPeopleProxy();
    return people.readPersonHistory(personId, type);
  }
  
  public java.lang.String[] readMeasureTypes() throws java.rmi.RemoteException{
    if (people == null)
      _initPeopleProxy();
    return people.readMeasureTypes();
  }
  
  public introsde.assignment.soap.bean.MeasureBean[] readPersonMeasure(java.lang.Long personId, java.lang.String type, java.lang.Long mid) throws java.rmi.RemoteException{
    if (people == null)
      _initPeopleProxy();
    return people.readPersonMeasure(personId, type, mid);
  }
  
  public java.lang.Long savePersonMeasure(java.lang.Long personId, introsde.assignment.soap.bean.MeasureBean measure) throws java.rmi.RemoteException{
    if (people == null)
      _initPeopleProxy();
    return people.savePersonMeasure(personId, measure);
  }
  
  public java.lang.Long updatePersonMeasure(java.lang.Long personId, introsde.assignment.soap.bean.MeasureBean measure) throws java.rmi.RemoteException{
    if (people == null)
      _initPeopleProxy();
    return people.updatePersonMeasure(personId, measure);
  }
  
  
}