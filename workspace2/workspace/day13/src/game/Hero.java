package game;

public class Hero {

	String name;		//이름
	int hp;				//현재 체력
	int mp;				//현재 마나
	int max_hp;			//최대 체력
	int max_mp;			//최대 마나
	
	int normal_attack;	//일반 공격력
	int skill_attack;	//스킬 공격력
	int special_attack;	//필살기 공격력
	 
	public Hero(String name, int max_hp, int max_mp, int normal_attack, int skill_attack, int special_attack) {
		super();
		this.name = name;
		this.max_hp = max_hp;
		this.max_mp = max_mp;
		this.normal_attack = normal_attack;
		this.skill_attack = skill_attack;
		this.special_attack = special_attack;
		hp = max_hp;
		mp = max_mp;
	}

	public void show() {
		System.out.println("--현재상태--");
		System.out.println("hp : " + hp + "/" + max_hp);
		System.out.println("mp : " + mp + "/" + max_mp);
		System.out.println();
	}
	
	public void normalAttack() {
		System.out.println(name + "이(가) 기본공격을 실행했습니다.");
		System.out.println("적에게 " + normal_attack + "만큼 피해를 입혔습니다.");
		
		show();
	}
	
	public void skillAttack() {
		System.out.println(name + "이(가) 스킬공격을 실행했습니다.");
		System.out.println("적에게 " + skill_attack + "만큼 피해를 입혔습니다.");
		System.out.println("mp가 10만큼 줄어들었습니다.");
		mp -= 10;

		show();
	}

	public void specialAttack() {
		System.out.println(name + " 필살기 실행");
		System.out.println("적에게" + special_attack + "만큼의 피해를 입혔습니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		show();
	}
	
	public void revive() {
		if( hp <= 0) {
			System.out.println("체력이 없어서 부활합니다.");
			hp = max_hp;
			mp = max_mp;
			
			show();
			
		}
	}
	
	public boolean checkMp(int needMp) {
		if(mp < needMp) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
}
