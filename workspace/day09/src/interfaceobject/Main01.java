package interfaceobject;

public class Main01 {

	public static void main(String[] args) {
		
		Character1 ch = new Character1("주인공");
		ch.attack();
		ch.walk();
		ch.run();
		ch.attack();
		ch.shield();
		ch.pickup();
		
		
		System.out.println("----------------------");
		
		Monster mon = new Monster("악당");
		
		mon.run();
		mon.walk();
		mon.shield();
		mon.attack();
	}
}
