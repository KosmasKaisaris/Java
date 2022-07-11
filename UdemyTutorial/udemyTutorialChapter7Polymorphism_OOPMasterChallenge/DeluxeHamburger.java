package udemyTutorialChapter7Polymorphism_OOPMasterChallenge;

public class DeluxeHamburger extends Hamburger {
	private String name = "Deluxe";
	private boolean chips;
	private boolean drinks; 
	
	public DeluxeHamburger( String meat, double basePrice,boolean chips,boolean drinks) {
		super("Max size bread", meat, basePrice);
		this.chips=chips;
		this.drinks=drinks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isChips() {
		return chips;
	}

	public void setChips(boolean chips) {
		this.chips = chips;
	}

	public boolean isDrinks() {
		return drinks;
	}

	public void setDrinks(boolean drinks) {
		this.drinks = drinks;
	}

	@Override
	public double theMoney(int lettuce, int tomato, int carrot, int potato) {
		return super.theMoney(0, 0, 0, 0);
	}
	
	
	
	

}
