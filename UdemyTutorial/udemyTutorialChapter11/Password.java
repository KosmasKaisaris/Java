package udemyTutorialChapter11;

public class Password {
	private static final int key = 748576362;
	private final int enctyptedPassword;
	
	public Password(int password) {
		this.enctyptedPassword = encryptDecrypt(password);
	}
	
	private int encryptDecrypt(int password) {
		return password ^ key;
	}
	
	public final void storePassword() {
		System.out.println("Saving password as " + this.enctyptedPassword);
	}
	
	public boolean letMeIn(int password) {
		if(encryptDecrypt(password) == this.enctyptedPassword) {
			System.out.println("Welcome");
			return true;
		}else {
			System.out.println("Nope , you cannot come in");
			return false;
		}
	}

}
