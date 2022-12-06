package InterfaceTest;

//public class Soldier2 implements Soldier{
public class Soldier2 extends SoldierAdapter{


	@Override
	public void work() {
		System.out.println("작업하기");
		
	}


}
