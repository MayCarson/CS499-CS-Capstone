package org.snhu.cs320.contact;


public class Contact {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) throws Exception {
		super();
	
		setId(id);
		
		setFirstName(firstName);
		
		setLastName(lastName);
		
		setPhoneNumber(phoneNumber);
		
		setAddress(address);
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
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

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
