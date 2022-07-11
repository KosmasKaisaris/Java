package udemyTutorialChapter7Polymorphism_OOPMasterChallenge;

public class HealthyBurger extends Hamburger {
	private String name = "HealthyBurger";
	private String meat;
	private double basePrice ;
	private int lettuce,tomato,carrot,potato,laxano,aggouri;
	
	
	public HealthyBurger( String meat, double basePrice,int laxano,int aggouri) {
		super("brown rye bread roll", meat, basePrice);
		this.meat=meat;
		this.basePrice=basePrice;
		this.laxano=laxano;
		this.aggouri=aggouri;
	}




	public String getMeat() {
		return meat;
	}


	public void setMeat(String meat) {
		this.meat = meat;
	}


	public double getBasePrice() {
		return basePrice;
	}


	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
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


	public int getLaxano() {
		return laxano;
	}


	public void setLaxano(int laxano) {
		this.laxano = laxano;
	}


	public int getAggouri() {
		return aggouri;
	}


	public void setAggouri(int aggouri) {
		this.aggouri = aggouri;
	}


	@Override
	public double theMoney( int lettuce, int tomato, int carrot, int potato) {
		double healthyCost=getLaxanoPrice()*this.laxano+getAggouri()*this.aggouri;
		System.out.println("You have to pay extra: " + aggouri*getAggouriPrice() + " for aggouri");
		System.out.println("You have to pay extra: " + laxano*getLaxanoPrice() + " for laxano");
		return super.theMoney( lettuce, tomato, carrot, potato)+healthyCost;
	}
	
	
	

	

}
