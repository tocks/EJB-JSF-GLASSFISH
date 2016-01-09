package org.jupiter.managedbens;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.jupiter.beans.UserBeanLocal;
import org.jupiter.entities.Address;
import org.jupiter.entities.User;

@ManagedBean(name="userBean")
@SessionScoped
public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;

private List<User> userList = new ArrayList<User>();
	
	@EJB
	private UserBeanLocal userBean;
	private User user ;
	private Address address;
	
	private String email;
	private String login;
	private String firstname;
	private String lastname;
	private String password;
	private String phone;
	private String surname;
	
	// address
	private int street;
	private String userAddress;
	private String zipcode;
	private String contry;
	private String city;
	private String departement;
	
	
	public UserBean() {
		
	}
	
	public String addUser(){
		user = new User();
		address = new Address();
		
		address.setAddress(userAddress);
		address.setCity(city);
		address.setContry(contry);
		address.setDepartement(departement);
		address.setStreet(street);
		address.setZipcode(zipcode);
		
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setLogin(login);
		user.setPhone(phone);
		user.setEmail(email);
		user.setPassword(password);
		user.setSurname(surname);
		user.setAddress(address);
		
		
		if(null != user){
			userBean.addUser(user);
		}
		return "success";
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
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

	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public UserBeanLocal getUserBean() {
		return userBean;
	}
	public void setUserBean(UserBeanLocal userBean) {
		this.userBean = userBean;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
		
}
