package game;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String mainMsg = "캐릭터 선택 \n"
					+ "1. 마법사\n"
					+ "2. 전사\n"
					+ "그 외, 해적\n"
					+ "입력 >> ";
		String menuMsg = "1. 일반공격\n"
				+ "2. 스킬공격\n"
				+ "3. 특수공격\n"
				+ "4. 종료";
		int choice = 0;
		
		Hero hero = null;
		
		System.out.println(mainMsg);
		choice = sc.nextInt();
		
		if(choice==1) {
			hero = new Wizard();
		} else if (choice==2) {
			hero = new Warrior();
		} else {
			hero = new Pirate();
		}
		
		out : while(true) {
			System.out.println(menuMsg);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				hero.normalAttack();
				break;
			case 2:
				hero.skillAttack();
				break;
			case 3:
				hero.specialAttack();
				break;
			case 4:
				if(hero instanceof Warrior) {
					((Warrior)hero).onlyWarrior();
				}
				break out;
			}
			
		}
		
		
	}
	
}
