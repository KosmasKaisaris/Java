package udemyTutorialChapter11;

 interface Accessible {    //visibility to all classes in the package
	int SOME_CONSTANT = 100; 
	public void methodA();  // all 3 are public in interface
	void  methodB();
	boolean methodC();

}
