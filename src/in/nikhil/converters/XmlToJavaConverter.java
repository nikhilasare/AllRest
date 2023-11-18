package in.nikhil.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import in.nikhil.Ticket;

public class XmlToJavaConverter {

	public static void main(String[] args) throws Exception {
		
		JAXBContext jaxbContext =JAXBContext.newInstance(Ticket.class);
		Unmarshaller unmarshaller= jaxbContext.createUnmarshaller();
		
		File xmlFile =new File("ticket.xml");
		
		Ticket ticket=(Ticket) unmarshaller.unmarshal(xmlFile);
		System.out.println(ticket.getPassenger());
		System.out.println(ticket);
		
	}
}
