package udemyTutorialChapter7Encapsulation;

public class Main {

	public static void main(String[] args) {
//		Player player = new Player();
//		player.fullName="Kosmas";
//		player.health=20;
//		player.weapon="Sword";
//		
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//		
//		damage = 11;
//		player.health=200;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
		
		EnhancedPlayer player = new EnhancedPlayer("Kosmas", 200 , "Sword");
		System.out.println("Initial health is " + player.getHealth());
		
		EnhancedPlayer player1 = new EnhancedPlayer("Kosmas", 50 , "Sword");
		System.out.println("Initial health is " + player1.getHealth());
	}
}
