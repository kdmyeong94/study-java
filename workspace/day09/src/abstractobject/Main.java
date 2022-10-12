package abstractobject;

public class Main {

	public static void main(String[] args) {
		
		Unit[] a = new Unit[3];
		
		a[0] = new Army("육군");
		a[1] = new Navy("해군");
		a[2] = new AirForce("공군");
		
		for (int i = 0 ; i < a.length ; i++) {
			a[i].attack();
			a[i].move();
		}
		
		
		
	}
}
