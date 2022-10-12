package boxing;

public class Navy extends Unit {

	public Navy(String name) {
		super(name);
	}

	public void attack() {
		super.attack();
		System.out.println(super.getName() + ">>해상공격 실행함");
	}

	public void nucleus() {
		System.out.println(this.getName() + ">> 핵미사일");
	}
}
