package org.jupiter.managedbens;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import org.jupiter.beans.ProspectionBeanLocal;
import org.jupiter.entities.Address;
import org.jupiter.entities.Company;
import org.jupiter.entities.Prospection;
import org.jupiter.entities.ProspectionStatus;
import org.jupiter.entities.User;

@ManagedBean(name="prospectionBean")
@SessionScoped
public class ProspectionBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Prospection> prospectionList = new ArrayList<Prospection>();
	
	@EJB
	private ProspectionBeanLocal prospectionBean;
	
	// entities required for Prospection
	private Prospection prospection;
	private String comment;
	private User customer;
	private User owner;
	private Company company;	
	private Address address;
	private ProspectionStatus prospectionStatus;
	/**
	// Prospection
	private String prospectionComment;
	private Date prospectionCreatedDate;
	private Date prospectionUpdateDate;
	private User prospectionProspectionCustomer;
	private User prospectionPropsectionOwner;
	private Company prospectionCompany;
	private Address prospectionAddress;
	private ProspectionStatus prospectionStatus;
	*/
	
	//customer
	private String customerEmail;
	private String customerLogin;
	private String customerFirstname;
	private String customerLastname;
	private String customerPassword;
	private String customerPhone;
	private String customerSurname;
	
	//owner
	private String ownerEmail;
	private String ownerLogin;
	private String ownerFirstname;
	private String ownerLastname;
	private String ownerPassword;
	private String ownerPhone;
	private String ownerSurname;
		
		
		// company
	private String companyName;
	private String companyPhone;
	private String website;
	private String sector;
	private String companyDescription;
		
	// address
	private int street;
	private String companyAddress;
	private String zipcode;
	private String contry;
	private String city;
	private String departement;
		
	// prospectStatus
	private String statusName;
	private String statusComment;
	
		

	public ProspectionBean() {
		prospection = new Prospection();
	}

	/**
	 * Add a prospection in database
	 * @return
	 */
		public String addProspection(){
			//  set customer informations
			customer.setFirstname(customerFirstname);
			customer.setLastname(customerLastname);
			customer.setPhone(customerPhone);
			customer.setEmail(customerEmail);
			customer.setPassword(customerPassword);
			customer.setSurname(customerSurname);
			customer.setLogin(customerLogin);
			
			// set owner informations
			owner.setFirstname(ownerFirstname);
			owner.setLastname(ownerLastname);
			owner.setLogin(ownerLogin);
			owner.setPhone(ownerPhone);
			owner.setLogin(ownerLogin);
			
			// set company informations
			company.setCompanyName(companyName);
			company.setDescription(companyDescription);
			company.setPhone(companyPhone);
			company.setSector(sector);
			company.setWebsite(website);
			
			// set address informations
			address.setAddress(companyAddress);
			address.setStreet(street);
			address.setCity(city);
			address.setDepartement(departement);
			address.setCity(city);
			address.setZipcode(zipcode);
			address.setCity(city);
			address.setContry(contry);
			
			// set prospectionStatus informations
			prospectionStatus.setStatusName(statusName);
			prospectionStatus.setStatusComment(statusComment);
			
			// set prospection informations
			prospection.setComment(comment);
			prospection.setCompany(company);
			prospection.setAddress(address);
			prospection.setCreatedDate(new Date());
			prospection.setUpdateDate(new Date());
			prospection.setOwner(owner);
			prospection.setCustomer(customer);
			prospection.setProspectionStatus(prospectionStatus);
			
			if(null != prospection){
				prospectionBean.addProspection(prospection);
			}
			return "success";
		}
public List<Prospection> getProspectionList() {
		return prospectionList;
	}


	public void setProspectionList(List<Prospection> prospectionList) {
		this.prospectionList = prospectionList;
	}


	public ProspectionBeanLocal getProspectionBean() {
		return prospectionBean;
	}


	public void setProspectionBean(ProspectionBeanLocal prospectionBean) {
		this.prospectionBean = prospectionBean;
	}


	public Prospection getProspection() {
		return prospection;
	}


	public void setProspection(Prospection prospection) {
		this.prospection = prospection;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public User getCustomer() {
		return customer;
	}


	public void setCustomer(User customer) {
		this.customer = customer;
	}


	public User getOwner() {
		return owner;
	}


	public void setOwner(User owner) {
		this.owner = owner;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public ProspectionStatus getProspectionStatus() {
		return prospectionStatus;
	}


	public void setProspectionStatus(ProspectionStatus prospectionStatus) {
		this.prospectionStatus = prospectionStatus;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public String getCustomerLogin() {
		return customerLogin;
	}


	public void setCustomerLogin(String customerLogin) {
		this.customerLogin = customerLogin;
	}


	public String getCustomerFirstname() {
		return customerFirstname;
	}


	public void setCustomerFirstname(String customerFirstname) {
		this.customerFirstname = customerFirstname;
	}


	public String getCustomerLastname() {
		return customerLastname;
	}


	public void setCustomerLastname(String customerLastname) {
		this.customerLastname = customerLastname;
	}


	public String getCustomerPassword() {
		return customerPassword;
	}


	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}


	public String getCustomerPhone() {
		return customerPhone;
	}


	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}


	public String getCustomerSurname() {
		return customerSurname;
	}


	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}


	public String getOwnerEmail() {
		return ownerEmail;
	}


	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}


	public String getOwnerLogin() {
		return ownerLogin;
	}


	public void setOwnerLogin(String ownerLogin) {
		this.ownerLogin = ownerLogin;
	}


	public String getOwnerFirstname() {
		return ownerFirstname;
	}


	public void setOwnerFirstname(String ownerFirstname) {
		this.ownerFirstname = ownerFirstname;
	}


	public String getOwnerLastname() {
		return ownerLastname;
	}


	public void setOwnerLastname(String ownerLastname) {
		this.ownerLastname = ownerLastname;
	}


	public String getOwnerPassword() {
		return ownerPassword;
	}


	public void setOwnerPassword(String ownerPassword) {
		this.ownerPassword = ownerPassword;
	}


	public String getOwnerPhone() {
		return ownerPhone;
	}


	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}


	public String getOwnerSurname() {
		return ownerSurname;
	}


	public void setOwnerSurname(String ownerSurname) {
		this.ownerSurname = ownerSurname;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyPhone() {
		return companyPhone;
	}


	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	public String getCompanyDescription() {
		return companyDescription;
	}


	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}


	public int getStreet() {
		return street;
	}


	public void setStreet(int street) {
		this.street = street;
	}


	public String getCompanyAddress() {
		return companyAddress;
	}


	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getContry() {
		return contry;
	}


	public void setContry(String contry) {
		this.contry = contry;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDepartement() {
		return departement;
	}


	public void setDepartement(String departement) {
		this.departement = departement;
	}


	public String getStatusName() {
		return statusName;
	}


	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}


	public String getStatusComment() {
		return statusComment;
	}


	public void setStatusComment(String statusComment) {
		this.statusComment = statusComment;
	}



	
	
	
	
}
