//****************************************
//     CS499 Capstone
//     artifact - Database
//     August 22, 2025
//     May Carson 
//****************************************

package org.snhu.cs320.contact;

import java.util.ArrayList;

public class ContactService {
	// updated HashMap to ArrayList to hold the list of contacts
	public ArrayList<Contact> contactList = new ArrayList<Contact>();

	// creates a menu window to show list of contacts on the console to check for errors
	// artifact - algorithm 
	public void displayContactList() {
		for (int counter = 0; counter < contactList.size(); counter++) {
			//creates the display that is in the console
			System.out.println("\t Contact ID: " + contactList.get(counter).getContact());
			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getPhoneNumber());
			System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
		}
	}
	
	// the constructor is used to create a new contact to assign to the list
	public void addContact(String firstName, String lastName, String phone, String address) {
		// Create the new contact
		Contact contact = new Contact(firstName, lastName, phone, address);
		contactList.add(contact);

	}

	
	// Contact ID is used to return a contact from the contact list
	public Contact getContact(String contactID) {
		Contact contact = new Contact(null, null, null, null);
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContact().contentEquals(contactID)) {
				contact = contactList.get(counter);
			}
		}
		return contact;
	}

	// deletes a  from contact list
	// "contactID" is used to find the the contact and delete it from the list
	public void deleteContact(String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.remove(counter);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("id: " + contactList + " is not found.");
			}
		}
	}


	// updates the address in the contact list
	public void updateAddress(String updatedString, String contactID) throws Exception {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setAddress(updatedString);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("address: " + contactID + " is not found.");
			}
		}
	}
	
	// added methods for adding contacts and updating address
	public void addContact1(String string, String string2, String string3, String string4) {
		
	}

	public void updateAddress1(String string, String string2) {
		
	}

}



