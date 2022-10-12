package interfaceobject;

public class Hello implements Unit{

	@Override
	public void attack() {
		
		System.out.println("공격");
	}

	@Override
	public void shield() {
		System.out.println("방어");
		
	}

}
