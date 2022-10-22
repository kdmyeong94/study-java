package day09;

import java.util.Scanner;

public class Kiosk {

	public static void main(String[] args) {

		// 커피 키오스크

		// 메뉴판

		// 커피
		// 아메리카노 : 4500
		// 카페라떼 : 5300
		// 카푸치노 : 5500

		// 티
		// 녹차 : 5500
		// 얼그레이 : 5500

		// 옵션
		// 공통
		// 핫, 아이스
		// 매장, 포장

		// 커피류 옵션
		// 카페인, 디카페인
		// 샷추가 : 300원

		// 기본 프로세스
		// 1. 주문
		// 2. 옵션 선택
		// 3. 결제
		// 4. 거스름돈
		// 5. 재주문 혹은 종료

		// 메뉴들 가격 변수 선언

		int americanoPrice = 4500;
		int cafeLattePrice = 5300;
		int cappuccinoPrice = 5500;

		int greenTeaPrice = 5500;
		int earlGaryPrice = 5500;

		Scanner sc = new Scanner(System.in);

		int money = 0; // 사용자에게 받을 돈
		int change = 0; // 거스름돈
		int totalPrice = 0; // 결제해야할 금액

		boolean isHot = true; // 핫 , 아이스
		boolean isTakeOut = true; // 매장, 포장
		boolean isCaffeine = true; // 카페인, 디카페인
		int shotCnt = 0; // 샷추가
		String orderCoffee = ""; // 사용자가 주문한 커피명
		int flag = 0; // 사용자가 선택하는 값을 담을 변수. 보통 flag라 명칭

		System.out.println("어서오세요 자바커피입니다.");

		while (true) {
//		TODO. 주문하기, 종료하기 구현
			System.out.println("1. 주문하기");
			System.out.println("2. 종료하기");

			System.out.println("입력 >> ");
			flag = sc.nextInt();

//		1. 주문하기

			if (flag == 1) { // 주문하기

//			새로운 주문을 받기 위한 이전 값을 초기화
				money = 0;
				change = 0;
				totalPrice = 0;
				orderCoffee = "";
//			메뉴판 출력
				System.out.println();
				System.out.println("==================메뉴판===============");
				System.out.println("1. 아메리카노 : " + americanoPrice);
				System.out.println("2. 카페라떼 : " + cafeLattePrice);
				System.out.println("3. 카푸치노 : " + cappuccinoPrice);
				System.out.println("4. 얼그레이 : " + earlGaryPrice);
				System.out.println("5. 녹차 : " + greenTeaPrice);
				System.out.println("==================메뉴판===============");

				System.out.println();
				System.out.println("입력 >> ");
				flag = sc.nextInt(); // 음료 선택

				if (flag == 1) { // 아메리카노
					totalPrice += americanoPrice;
					orderCoffee = "아메리카노";
				} else if (flag == 2) { // 카페라떼
					orderCoffee = "카페라뗴";
					totalPrice += cafeLattePrice;
				} else if (flag == 3) { // 카푸치노
					orderCoffee = "카페라떼";
					totalPrice += cappuccinoPrice;
				} else if (flag == 4) { // 얼그레이
					orderCoffee = "얼그레이";
					totalPrice += earlGaryPrice;
				} else if (flag == 5) { // 녹차
					orderCoffee = "녹차";
					totalPrice += greenTeaPrice;
				} else { // 그 외의 값
					System.out.println("메뉴판에 있는 종류를 선택해주세요.");
					continue; // 반복문 처음으로 돌아가 다시 실행
				}

//			옵션 추가
				System.out.println();
				System.out.println("옵션을 선택해주세요.");
				System.out.println();

				if (flag == 1 || flag == 2 || flag == 3) { // 커피류 옵션

					while (true) { // 원하는 답변을 들을 때 까지
						System.out.println("1.카페인");
						System.out.println("2.디카페인");
						System.out.println();

						System.out.println("입력 >> ");
						flag = sc.nextInt();

						if (flag == 1) { // 1. 카페인선택
							isCaffeine = true;
							break;
						} else if (flag == 2) { // 2.디카페인 선택
							isCaffeine = false;
							break;
						} else {
							System.out.println("다시 입력해주세요.");
						}

					} // while문

					while (true) { // 샷추가 반복문

						System.out.println();
						System.out.println("샷 추가하시겠습니까?");
						System.out.println();

						System.out.println("1. 예");
						System.out.println("2. 아니오");

						System.out.println();
						System.out.println("입력 >> ");

						flag = sc.nextInt();

						if (flag == 1) { // 샷추가 할거면

							System.out.println();
							System.out.print("추가할 샷 : ");
							shotCnt = sc.nextInt();
							totalPrice += (shotCnt * 300);
							break;
						} else if (flag == 2) { // 샷추가 안하면
							break;
						} else {
							System.out.println("다시 입력해주세요");
							System.out.println();
						}

					} // 샷추가 while문

				} // 커피류 옵션 if문

//			공통 옵션
				while (true) {
					System.out.println();
					System.out.println("1.핫");
					System.out.println("2.아이스");
					System.out.println();

					System.out.println("입력 >> ");
					flag = sc.nextInt();

					if (flag == 1) { // 핫 선택
						isHot = true;
						break;
					} else if (flag == 2) { // 아이스
						isHot = false;
						break;
					} else {
						System.out.println("다시 입력해주새요.");
					}

				} // 핫/아이스 while

				while (true) {
					System.out.println();
					System.out.println("1. 매장");
					System.out.println("2. 테이크아웃");
					System.out.println();

					System.out.println("입력 >>");
					flag = sc.nextInt();

					if (flag == 1) { // 매장
						isTakeOut = false;
						break;
					} else if (flag == 2) { // 테이크아웃
						isTakeOut = true;
						break;
					} else { // 그외의값
						System.out.println("다시 입력해주세요");

					}
				} // 매장 while

//			결제하기
				while (true) {
					System.out.println();
					System.out.println("총 금액은" + totalPrice + "원 입니다.");
					System.out.println();
					System.out.println("결제 금액 : ");
					money = sc.nextInt();

					if (money < totalPrice) { // 제값을 치르지 않은 경우
						System.out.println("금액이 작습니다. 다시 넣어주세요.");
						continue;
					} else { // 잔돈 치르기
						change = money - totalPrice;
						break;
					}

				} // 결제 while

				System.out.println();
				System.out.println("감사합니다.");
				System.out.println();

//			영수증 출력
				System.out.println("======영수증======");

				if (isHot) {
					System.out.println("핫");
				} else {
					System.out.println("아이스");
				}

				System.out.println("커피이름 : " + orderCoffee);

				if (shotCnt > 0) {
					System.out.print("샷 추가 : ");
					System.out.println(shotCnt + "샷");
				} // 샷추가 출력

				if (!isCaffeine) {
					System.out.println("논 카페인");
				} // 논카페인

				if (isTakeOut) {
					System.out.println("테이크아웃");
				} else {
					System.out.println("매장");
				} // 테이크아웃,매장
				System.out.println();

				System.out.println("결제 금액 : " + totalPrice);
				System.out.println("받은 금액 : " + money);
				System.out.println("거스름돈 : " + change);
				System.out.println();
				System.out.println("============================");

			} else if (flag == 2) {
//			2. 종료하기
//			while 문 break;
				System.out.println("감사합니다.");
				break;
			} else { // 그 외의 값
//				3. 그외의 값
				System.out.println("다시 한번 입력해주세요.");
			}

		}

	}
}
