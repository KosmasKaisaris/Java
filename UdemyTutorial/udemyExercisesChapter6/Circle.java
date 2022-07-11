package udemyExercisesChapter6;

public class Circle {
	private double radius;

	public Circle(double radius) {

		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return (radius * radius * Math.PI);
	}

	public void setRadius(double radius) {
		if (radius < 0) {
			this.radius = 0;
		} else {
			this.radius = radius;
		}
	}

}
