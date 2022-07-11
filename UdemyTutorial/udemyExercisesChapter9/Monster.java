package udemyExercisesChapter9;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
	private String name;
	private int hitPoints;
	private int strength;
	
	public Monster(String name, int hitPoints,int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getStrength() {
		return strength;
	}
	

	@Override
	public String toString() {
		return "Monster [name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + "]";
	}

	@Override
	public List<String> write() {
		List theMonsterList = new ArrayList<>();
		theMonsterList.add(0, this.name);
		theMonsterList.add(1, this.hitPoints);
		theMonsterList.add(2, this.strength);
		return theMonsterList;
	}

	@Override
	public void read(List<String> saveData) {
		if(saveData!=null && saveData.size()>0) {
			this.name = saveData.get(0);
			this.hitPoints = Integer.parseInt(saveData.get(1));
			this.strength = Integer.parseInt(saveData.get(2));
		}
		
		
	}
	
	

}
