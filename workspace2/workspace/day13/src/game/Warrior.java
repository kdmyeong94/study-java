package game;

public class Warrior extends Hero{
	public Warrior() {
		super("전사", 30, 10, 5, 15, 100);
	}

	@Override
	public void skillAttack() {
		if(!checkMp(3)) {
			System.out.println("Mp 부족");
			show();
			return;
		}
		System.out.println(name + "이 스킬공격!");
		System.out.println("적에게 " + skill_attack + "만큼의 피해를 입혔습니다.");
		mp -= 3;
		show();
	}

	@Override
	public void specialAttack() {
		System.out.println(name + "이(가) 스킬 시전 중");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("적에게 " + special_attack + "만큼의 피해를 입혔습니다.");
		hp -= 10;
		show();
		revive();
	}
	
	public void onlyWarrior() {
		System.out.println("위대한 전사가 게임을 종료합니다.");
	}
	
}
