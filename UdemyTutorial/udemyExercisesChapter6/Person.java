package udemyExercisesChapter6;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
		
	}
	
	public void setAge(int age) {
		if(age<0 || age >100) {
			this.age=0;
		}else {
			this.age=age;
		}
	}
	
	public boolean isTeen() {
		if(this.age>12 && this.age<20) {
			return true;
		}else {
			return false;
		}
	}
	
//	public String getFullName() {
//		if(firstName==null && lastName==null) {
//			return "";
//		}else if(lastName==null) {
//			return firstName;
//		}else if(firstName==null) {
//			return lastName;
//		}
//	}
	public String getFullName() {
		if(firstName.isEmpty() && lastName.isEmpty()) {
			return "";
		}else if(firstName.isEmpty()) {
			return lastName;
		}else if(lastName.isEmpty()) {
			return firstName;
		}else {
			return firstName + " " + lastName;
		}
	}

}
