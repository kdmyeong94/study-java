package abstractTest;

public abstract class Animal {

	String name;
	
	public void eat() {
		System.out.println("먹다.");
	}
	
	public abstract void cry();
	
}
