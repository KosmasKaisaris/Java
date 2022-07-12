package udemyTutorialChapter11;

public class Series {
	
	public static long nSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
			
		}
		return sum;
	}
	
	public static long factorial(int n) {
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum*=i;
		}
		return sum;
	}
	
//	public static long fibonacci(int n) {
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			if(i>1) {
//				sum+=(i-1)+ (i-2);
//			}
//			sum+=i;
//		}
//		return sum;
//	}

}
