package introsde.assignment.soap.client;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Random;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import introsde.assignment.soap.bean.MeasureBean;
import introsde.assignment.soap.bean.PersonBean;
import introsde.assignment.soap.ws.People;

public class PeopleClient {
	private static FileWriter writer = null;
	private static People people = null;
	private static PersonBean[] peopleList = null;
	private static MeasureBean[] measureList = null;
	private static PersonBean personB, newPersonB = null;
	private static MeasureBean newMeasureB = null;
	private static String[] measureType = null;
	private static Long idperson;
	private static String type;
	private static MeasureBean newmb = null;

	private static void write(String line) {
		try {
			System.out.println(line);
			writer.append(line + " \n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://rodrigo-sestari-soap-server.herokuapp.com/ws/people?wsdl");
		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://ws.soap.assignment.introsde/", "PeopleService");
		Service service = Service.create(url, qname);

		people = service.getPort(People.class);

		writer = new FileWriter("client-server-xml.log");
		try {
			try {
				System.out.println("START client XML");
				write("URL BASE: http://rodrigo-sestari-soap-server.herokuapp.com/ws/people?wsdl");
				write("------------- \n");
				write("Request 1 : readPersonList");
				request1();
				write("------------- \n");

				write("Request 2 : readPerson");
				request2();
				write("------------- \n");

				write("Request 3 : updatePerson");
				request3();
				write("------------- \n");

				write("Request 4 : createPerson");
				request4();
				write("------------- \n");

				write("Request 5 : deletePerson");
				request5();
				write("------------- \n");

				write("Request 6 : createPerson");
				request6();
				write("------------- \n");
				
				write("Request 7 : readMeasureTypes");
				request7();
				write("------------- \n");

				write("Request 8 : readPersonMeasure");
				request8();
				write("------------- \n");

				write("Request 9 : savePersonMeasure");
				request9();
				write("------------- \n");

				write("Request 10 : savePersonMeasure");
				request10();
				write("------------- \n");

				System.out.println("END client XML");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} finally {
			writer.flush();
			writer.close();
		}

	}

	public static void request1() {
		try {
			peopleList = people.readPersonList();
			if (peopleList != null) {
				for (PersonBean pb : peopleList) {
					write(pb.toString());
				}
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void request2() {
		try {
			if ((peopleList != null) && (peopleList.length > 0)) {
				Long id = peopleList[0].getId();
				personB = people.readPerson(id);
				write(personB.toString());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void request3() {
		try {
			if (personB != null) {

				personB.setFirstname("change at" + new Date());

				Long id = people.updatePerson(personB);
				personB = people.readPerson(id);
				write(personB.toString());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void request4() {
		try {

			newPersonB = new PersonBean();
			newPersonB.setFirstname("Rodrigo");
			newPersonB.setLastname("create: " + new Date());
			newMeasureB = new MeasureBean();
			newMeasureB.setMeasureType("height");
			newMeasureB.setMeasureValue("99");
			newMeasureB.setMeasureValueType("integer");
			MeasureBean[] mbl = { newMeasureB };
			newPersonB.setCurrentHealth(mbl);

			Long id = people.createPerson(newPersonB);

			personB = people.readPerson(id);
			write(personB.toString());

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void request5() {
		try {

			if (personB != null) {
				Long id = personB.getId();
				people.deletePerson(id);
				personB = people.readPerson(id);
				if (personB == null) {
					write("don't found");
				} else {
					write(personB.toString());
				}
			}

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void request6() {
		try {
			if ((peopleList != null) && (peopleList.length > 0)) {
				idperson = peopleList[0].getId();
				measureList = people.readPersonHistory(idperson, "weight");
				if (measureList != null) {
					for (MeasureBean mb : measureList) {
						write(mb.toString());
					}
				}
				write(personB.toString());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void request7() {
		try {
			measureType = people.readMeasureTypes();
			if (measureType != null) {
				for (String mt : measureType) {
					write(mt);
				}
			}

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void request8() {
		try {
			if ((measureList != null) && (measureList.length > 0)) {
				Long mid = measureList[0].getMid();
				type = measureList[0].getMeasureType();

				measureList = people.readPersonMeasure(idperson, type, mid);
				if (measureList != null) {
					for (MeasureBean mb : measureList) {
						write(mb.toString());
					}
				}
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void request9() {
		try {
			MeasureBean newmb = new MeasureBean();
			newmb.setMeasureType("newType");
			newmb.setMeasureValue("666");
			newmb.setMeasureValueType("integer");

			Long mid = people.savePersonMeasure(idperson, newmb);
			measureList = people.readPersonMeasure(idperson, "newType", mid);
			if (measureList != null) {
				for (MeasureBean mb : measureList) {
					write(mb.toString());
				}
			}

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void request10() {
		try {

			if (newmb != null) {
				Random rd = new Random();

				Integer newvalue = rd.nextInt();
				newmb.setMeasureValue(newvalue.toString());
				people.updatePersonMeasure(idperson, newmb);

				measureList = people.readPersonMeasure(idperson, newmb.getMeasureType(), newmb.getMid());
				if (measureList != null) {
					for (MeasureBean mb : measureList) {
						write(mb.toString());
					}
				}
			}

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
