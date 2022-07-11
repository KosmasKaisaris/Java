package udemyExercisesChapter9;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
	private String name;
	private String weapon;
	private int hitPoints;
	private int strength;
	
	public Player(String name,int hitPoints,int strength) {
		this.name= name;
		this.hitPoints=hitPoints;
		this.strength=strength;
		this.weapon = "Sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public List<String> write() {
		List<String> theList = new ArrayList<String>();
		theList.add(0 , "" +  this.name);
		theList.add(1 ,"" +   this.weapon);
		theList.add(2, "" + this.hitPoints);
		theList.add(3 , "" + this.strength);
		return theList;
		
	}

	@Override
	public void read(List<String> theList) {
		if(theList.size() >0 && theList!=null) {
			this.name = theList.get(0);
			this.weapon = theList.get(1);
			this.hitPoints = Integer.parseInt(theList.get(2));
			this.strength = Integer.parseInt(theList.get(3));
		}
		
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", weapon=" + weapon + ", hitPoints=" + hitPoints + ", strength=" + strength
				+ "]";
	}
	
	
	
	

}
