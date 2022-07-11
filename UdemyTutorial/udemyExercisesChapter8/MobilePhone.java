package udemyExercisesChapter8;

import java.util.ArrayList;

public class MobilePhone {

	private String myNumber;
	private ArrayList<Contact> myContacts;

	public MobilePhone(String phoneNumber) {
		this.myNumber = phoneNumber;
		this.myContacts=new ArrayList<>();
	}

	public boolean addNewContact(Contact contact) {
		if(findContact(contact)>=0){
			return false;
		} else {
			myContacts.add(contact);
			return true;
		}
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		int position=findContact(oldContact);
		if(position>=0){
			myContacts.set(position, newContact);
			return true;
		} else {
			return false;
		}
	}

	public boolean removeContact(Contact contact) {
		
		if(findContact(contact) >=0)  {
			myContacts.remove(findContact(contact));
			return true;
		} else {
			return false;
		}

	}

	public int findContact(Contact contact) {
		for(int i=0; i<myContacts.size();i++) {
			if(contact.getName()==myContacts.get(i).getName()) {
				return i;
			}
		}
		return -1;
	}
	
	public int findContact(String name) {
		for(int i=0;i<myContacts.size();i++) {
			if(myContacts.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public Contact queryContact(String name) {
		if(findContact(name)>=0) {
			return myContacts.get(findContact(name));
			
		}
		return null;
	}
	
	public void printContacts() {
		for(Contact num : myContacts) {
			System.out.println(num);
		}
	}

}
