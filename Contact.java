//****************************************
//     CS499 Capstone
//     artifact - Software Design 
//     August 22, 2025
//     May Carson 
//****************************************


package org.snhu.cs320.contact;

public class Contact {
	// implemented an email string for site customers
	// changed phone to phoneNumber to be more clear
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private String email;
	
	// constructor for contacts
	public Contact(String id, String firstName, String lastName, String phone, String address, String email) throws Exception {
		super();

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}

	// added constructor
	public Contact(Object object, Object object2, Object object3, Object object4, String string) {

	}
	// added constructor 
	public Contact(String firstName2, String lastName2, String phone, String address2) {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		if (firstName == null || firstName.trim().length() < 1 || firstName.length() > 10) {
			throw new Exception("First Name not vaild");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws Exception {
		if (lastName == null || lastName.trim().length() < 1 || lastName.length() > 10) {
			throw new Exception("First Name not vaild");
		}
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) throws Exception {
		if (phoneNumber == null || phoneNumber.trim().length() < 1 || phoneNumber.length() > 10 || phoneNumber.matches(".*\\D+.*")) {
			throw new Exception("Phone Number not vaild");
		}
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) throws Exception {if (address == null || address.trim().length() < 1 || address.length() > 30) {
		throw new Exception("Address not vaild");
		}
		this.address = address;
	}
	
	private void setId(String id) throws Exception {
		if (id == null || id.trim().length() < 1 || id.length() > 10) {
			throw new Exception("Id not vaild");
		}
	}
	
	public String getEmail() {
		return address;
	}
	
	// created length limits for email string

	public void setEmail(String email) throws Exception {if (email == null || email.trim().length() < 1 || email.length() > 20) {
		throw new Exception("Email not vaild");
		}
		this.email = email;
	}

	// added method
	public String getId() {
	
		return null;
	}
	// added methods
	public String getContact() {
		
		return null;
	}
	//added method
	public Object getContactID() {

		return null;
	}

}
