package udemyTutorialChapter9;

public class MainAbstract {

	public static void main(String[] args) {
		Dog dog = new Dog("Yorkie");
		dog.breathe();
		dog.eat();
		
		Bird parrot = new Parrot("Australian ringneck");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		
		Penguin penguin = new Penguin("Emperor");
		penguin.fly();
	}

}
