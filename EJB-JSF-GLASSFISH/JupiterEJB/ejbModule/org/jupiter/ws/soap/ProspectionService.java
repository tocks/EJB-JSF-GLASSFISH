package org.jupiter.ws.soap;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.jupiter.beans.ProspectionBeanLocal;
import org.jupiter.entities.Address;
import org.jupiter.entities.Company;
import org.jupiter.entities.Prospection;
import org.jupiter.entities.ProspectionStatus;
import org.jupiter.entities.User;

@Stateless
@WebService(name = "http.jupiter.prospect.org")
public class ProspectionService {

	/**
	 * Default constructor.
	 */
	public ProspectionService() {
		// TODO Auto-generated constructor stub
	}

	@EJB
	private ProspectionBeanLocal prospectionBean;

	@WebMethod(action = "add")
	public void addProspection(
			@WebParam(name = "company") Company company, @WebParam(name = "comment") String comment,
			@WebParam(name = "customer") User customer, @WebParam(name = "created") Date created,
			@WebParam(name = "updated") Date updated, @WebParam(name = "owner") User owner,
			@WebParam(name = "prospectionStatus") ProspectionStatus prospectionStatus,
			@WebParam(name = "street") int street, @WebParam(name = "address") String addressDes,
			@WebParam(name = "city") String city, @WebParam(name = "county") String country,
			@WebParam(name = "zipcode") String zipcode, @WebParam(name = "firstname") String firstname,
			@WebParam(name = "lastname") String lastname, @WebParam(name = "login") String login,
			@WebParam(name = "email") String email, @WebParam(name = "phone") String phone) {

		Address address = new Address();
		address.setStreet(street);
		address.setCity(city);
		address.setContry(country);
		address.setZipcode(zipcode);

		User user = new User();

		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setLogin(login);
		user.setEmail(email);
		user.setPhone(phone);
		user.setAddress(address);

		created = new Date();
		Prospection prospect = new Prospection();
		prospect.setAddress(address);
		prospect.setComment(comment);
		prospect.setCompany(company);
		prospect.setCustomer(customer);
		prospect.setOwner(owner);
		prospect.setPropsectionOwner(owner);
		prospect.setProspectionStatus(prospectionStatus);
		prospect.setCreatedDate(created);
		prospect.setUpdateDate(created);
		prospect.setUpdateDate(created);

		if (null != prospect || null != prospect.getCompany()) {

			prospectionBean.addProspection(prospect);
		}
	}

}
