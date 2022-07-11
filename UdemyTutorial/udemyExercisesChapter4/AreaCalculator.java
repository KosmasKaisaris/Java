package udemyExercisesChapter4;

public class AreaCalculator {

	public static void main(String[] args) {

		System.out.println(area(5.6,4.4));
		System.out.println(area(5.0));
		System.out.println(area(8));
		System.out.println(area(3, 5));
		System.out.println(area(5.0,4.0));
		System.out.println(area(-1.0,4.0));
			
		

	}
	
	public static double area( double radius) {
		if(radius<0) {
			return -1;
		}else {
			return radius*radius*Math.PI;
		}
	}
	
	public static double area(double x , double y) {
		if(x<0 || y<0) {
			return -1;
		}else {
			return x*y;
		}
	}
//	
//	public double area(double y, double y) {
//		
//	}
//	public float area(double x ,double y) {
//		
//	}
	

}
