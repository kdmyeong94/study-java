package game;

public class Pirate extends Hero{
	public Pirate() {
		super("해적", 20, 20, 3, 20, 100);
	}

	@Override
	public void normalAttack() {
		if(!checkMp(3)) {
			System.out.println("마나 부족!");
			show();
			return;
		}
		System.out.println(name + "이 기본공격을 가했습니다.");
		mp -= 3;
		System.out.println("적에게 " + normal_attack + "만큼의 피해를 입혔습니다.");
		show();
	}

	@Override
	public void skillAttack() {
		if(!checkMp(2)) {
			System.out.println("마나 부족!");
			show();
			return;
		}
		System.out.println("적에게 " + skill_attack + "만큼의 피해를 입혔습니다.");
		hp -= 5;
		mp -= 2;
		show();
		revive();
	}

	
}
