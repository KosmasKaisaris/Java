package udemyTutorialChapter7Polymorphism_OOPMasterChallenge;

public class MainOOP {

	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("normal","Pork",3.50);
		System.out.println(hamburger.theMoney( 1, 2, 0, 1));
		System.out.println("New order");
		HealthyBurger healthyBurger = new HealthyBurger("Pork",5.40,2,1);
		System.out.println(healthyBurger.theMoney(2, 3, 1, 1));
		System.out.println("New order");
		DeluxeHamburger deluxeHamburger = new DeluxeHamburger("chicken",10,true,true);
		System.out.println(deluxeHamburger.theMoney(1,1,1,1));
	}

}
