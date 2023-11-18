package in.nikhil.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.nikhil.Passenger;
import in.nikhil.Ticket;

public class JavaToXmlConverter {

	public static void main(String[] args) throws Exception {
		
		Passenger passenger=new Passenger();
		passenger.setFname("nikhil");
		passenger.setLname("asare");
		passenger.setPhno(12345L);
		
		Ticket ticket=new Ticket();
		ticket.setId(1234);
		ticket.setStatus("Approved");
		ticket.setFrom("Hyd");
		ticket.setTo("Pune");
		ticket.setPrice(540.50);
		ticket.setPassenger(passenger);
		ticket.setProvider("indigo");
		
		// Convert java obj data into xml file using jax-b
		JAXBContext jaxbContext =JAXBContext.newInstance(Ticket.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(ticket, new File("ticket.xml"));
		System.out.println("XML File created successfully......");
		
	}
}
