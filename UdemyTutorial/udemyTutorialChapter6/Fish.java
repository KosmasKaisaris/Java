package udemyTutorialChapter6;

public class Fish  extends Animal {

  private int gills;
  private int eyes;
  private int fins;
  
public Fish(String name, int brain, int weight,int gills,int eyes,int fins) {
	super(name, brain, 1,1, weight);
	this.gills=gills;
	this.eyes=eyes;
	this.fins=fins;
}

private void rest() {
	
}
private void moveMuscles() {
	
}
private void moveBackFin() {
	
}
private void swim(int speed) {
	moveMuscles();
	moveBackFin();
	super.move(speed);
	
	
}
  
  
}
