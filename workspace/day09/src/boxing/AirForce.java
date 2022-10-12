package boxing;

public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
	}

	public void attack() {
		super.attack();
		System.out.println(super.getName() + ">>공중공격 실행함");
	}

	public void bombing() {
		System.out.println(this.getName() + ">> 폭격");
	}
}
