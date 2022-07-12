package udemyTutorialChapter11;

public class Main {

	public static void main(String[] args) {
		Series theSeries = new Series();
//		System.out.println(theSeries.nSum(10));
//		System.out.println(theSeries.factorial(10));
//		System.out.println(theSeries.fibonacci(10));
		String varFour = "this is private to main";
		ScopeCheck scopeInstance = new ScopeCheck();
		
		ScopeCheck.InnerClass innerClass2 = scopeInstance.new InnerClass();
//		System.out.println("Var3 is not accessible here " +  innerClass2.var3);  cause is private 
		
		scopeInstance.useInner();
		System.out.println("scopeInstace var1 is "+ scopeInstance.getVar1());
		System.out.println(varFour);
		scopeInstance.timesTwo();
		
		ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
		innerClass.timesTwo();
		
		
		
		
		
		

	}

}
