package casting;

public class Army extends Unit {

	public Army(String name) {
		super(name);
	}

//	override 메서드
//	공격의 형태를 육군에 맞게 변경하지만, 부모클래스가 가지고
//	있는 공격 준비 기능을 super 키워드를 사용해서 호출하려고함
	public void attack() {
		super.attack();
		System.out.println(super.getName() + ">> 지상공격 실행함");

	}

	public void tank() {
		System.out.println(super.getName() + ">> 탱크공격");
	}
}
