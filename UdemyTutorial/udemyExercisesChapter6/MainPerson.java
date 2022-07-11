package udemyExercisesChapter6;

public class MainPerson {

	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("FullName = " + person.getFullName());
		System.out.println("teen = " + person.isTeen());
		person.setFirstName("John");
//		System.out.println(person.getFirstName());
		person.setAge(18);
		System.out.println("FullName = " + person.getFullName());
		System.out.println("teen = " + person.isTeen());
		person.setLastName("Smith");
//		System.out.println(person.getLastName());
		System.out.println("FullName = " + person.getFullName());
		

	}

}
