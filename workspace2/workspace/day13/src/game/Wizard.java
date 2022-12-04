package game;

public class Wizard extends Hero{
	
	public Wizard() {
		super("마법사", 15, 30, 1, 30, 100);
	}

	@Override
	public void normalAttack() {
		hp -= 2;
		super.normalAttack();
		revive();
	}

	@Override
	public void skillAttack() {
		if(checkMp(10)) {
			super.skillAttack();
		} else {
			System.out.println("마나 부족으로 스킬 사용 불가");
		}
		
	}

	@Override
	public void specialAttack() {
		if(!checkMp(10)) {
			return;
		}
		System.out.println(name + "이(가) 스킬 시전 중");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("적에게 " + special_attack + "만큼의 피해를 입혔습니다.");
		mp -= 10;
		hp -= 10;
		show();
		revive();
	}
	
	
}
