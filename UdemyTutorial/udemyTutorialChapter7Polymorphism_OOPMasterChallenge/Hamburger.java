package udemyTutorialChapter7Polymorphism_OOPMasterChallenge;

public class Hamburger {
	private String breadRoolType;
	private String meat;
	private int lettuce,tomato,carrot,potato;
	private double basePrice ;
	private String name="basicHamburger";
	private double finalPrice;
	private double lettucePrice=0.50,tomatoPrice=0.60,carrotPrice=0.30,potatoPrice=0.40;
	private double laxanoPrice=0.30,aggouriPrice=0.20;
	
	
	
	public double getLaxanoPrice() {
		return laxanoPrice;
	}



	public void setLaxanoPrice(double laxanoPrice) {
		this.laxanoPrice = laxanoPrice;
	}



	public double getAggouriPrice() {
		return aggouriPrice;
	}



	public void setAggouriPrice(double aggouriPrice) {
		this.aggouriPrice = aggouriPrice;
	}



	public Hamburger(String breadRoolType,String meat,double basePrice) {
		this.breadRoolType=breadRoolType;
		this.meat=meat;
		this.basePrice=basePrice;
	}

	
	
	public String getBreadRoolType() {
		return breadRoolType;
	}



	public void setBreadRoolType(String breadRoolType) {
		this.breadRoolType = breadRoolType;
	}



	public String getMeat() {
		return meat;
	}



	public void setMeat(String meat) {
		this.meat = meat;
	}



	public int getLettuce() {
		return lettuce;
	}



	public void setLettuce(int lettuce) {
		this.lettuce = lettuce;
	}



	public int getTomato() {
		return tomato;
	}



	public void setTomato(int tomato) {
		this.tomato = tomato;
	}



	public int getCarrot() {
		return carrot;
	}



	public void setCarrot(int carrot) {
		this.carrot = carrot;
	}



	public int getPotato() {
		return potato;
	}



	public void setPotato(int potato) {
		this.potato = potato;
	}



	public double getBasePrice() {
		return basePrice;
	}



	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public double theMoney(int lettuce,int tomato,int carrot,int potato) {
		System.out.println("Base price of the hamburger is: "+ basePrice);
		System.out.println("You have to pay extra: " + lettuce*lettucePrice + " for lettuce");
		System.out.println("You have to pay extra: " + tomato*tomatoPrice + " for tomato");
		System.out.println("You have to pay extra: " + carrot*carrotPrice + " for carrot");
		System.out.println("You have to pay extra: " + potato*potatoPrice + " for potato");
		double totalPrice = this.basePrice + lettuce*lettucePrice + tomato*tomatoPrice+carrot*carrotPrice+potato*potatoPrice;
		System.out.println("Your total price is " + totalPrice);
		return totalPrice;
	}
	
	
	
	

}
