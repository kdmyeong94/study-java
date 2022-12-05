package game;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		
//		Hero hero = new Hero("테스트", 10, 10, 20 , 20, 100);
//		
//		hero.normalAttack();
//		hero.skillAttack();
//		
//		hero.specialAttack();
		
//		Wizard wizard = new Wizard();
//		wizard.normalAttack();
//		wizard.skillAttack();
//		wizard.skillAttack();
//		wizard.skillAttack();
//		wizard.specialAttack();
//		wizard.normalAttack();
//		wizard.normalAttack();
		
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
		System.out.println(mainMsg);
		choice = sc.nextInt();
		
		if(choice==1) {
			Wizard wizard = new Wizard();
			
			while(true) {
				System.out.println(menuMsg);
				choice = sc.nextInt();
				if(choice == 1) {
					wizard.normalAttack();
				} else if(choice==2) {
					wizard.skillAttack();
				} else if(choice==3) {
					wizard.specialAttack();
				} else if(choice==4) {
					break;
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			}				
		} else if(choice ==2 ) {
			Warrior warrior = new Warrior();
			choice = sc.nextInt();
			while(true) {
				System.out.println(menuMsg);
				if(choice == 1) {
					warrior.normalAttack();
				} else if(choice==2) {
					warrior.skillAttack();
				} else if(choice==3) {
					warrior.specialAttack();
				} else if(choice==4) {
					break;
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			}	
		} else {
			Pirate pirate = new Pirate();
			choice = sc.nextInt();
			while(true) {
				System.out.println(menuMsg);
				if(choice == 1) {
					pirate.normalAttack();
				} else if(choice==2) {
					pirate.skillAttack();
				} else if(choice==3) {
					pirate.specialAttack();
				} else if(choice==4) {
					break;
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			}	
		}
		
		
		
	}
}