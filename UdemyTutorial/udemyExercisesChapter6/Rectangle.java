package udemyExercisesChapter6;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		
		this.width = width;
		this.length = length;
	}
	
	public void setWidth(double width) {
		if(width<0) {
			this.width=0;
		}else {
			this.width=width;
		}
	}
	public void setLength(double length) {
		if(length<0) {
			this.length=0;
		}else {
			this.length=length;
		}
	}

	public double getLength() {
		return this.length;
	}


	public double getWidth() {
		return this.width;
	}
	
	protected double getArea() {
		return getWidth() * getLength();
	}
	
	
	

}
