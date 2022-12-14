package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * 성별과 생년월일을 입력받아서 해당 데이터 불러오기
		 * 
		 * 연령별 피부고민 선택 (청소년 > 보습 / men,women > 보습,트러블,안티에이징 / old men, women > 보습, 안티에이징
		 *  
		 * 사용하고자 하는 단계 
		 * Child 	: 1토너 2로션
		 * Men  	: 1토너 2로션 3올인원
		 * OldMen	: 1토너 2로션 3올인원
		 * Women 	: 1토너 4에센스 2로션 5크림
		 * OldWomen	: 1토너 4에센스 2로션 5크림
		 */
		CosmeticWomen cosW = new CosmeticWomen();
		CosmeticMen cosM = new CosmeticMen();
		CosmeticOldWomen cosOW = new CosmeticOldWomen();
		CosmeticOldMen cosOM = new CosmeticOldMen();
		CosmeticChild cosC = new CosmeticChild();
		
		Scanner sc = new Scanner(System.in);
		
		int gen = 0;    // 성별을 저장할 변수  1 = 남자 , 2 = 여자
		int age = 0; 	// 연령대를 저장할 변수 1 = 청소년 , 2 = 성인 , 3 = 중장년층
		System.out.println("안녕하세요. 생년월일과 성별을 입력해주세요.");
		while (true) {  // 나이를 입력 받기 위한 while
			String yy = "";
			while(true) {
			System.out.print("생년월일 (ex: 940511) : "); // 현재나이로 받아도 되지만 추출을 사용하기위해 생년월일로 받기
			String birth = sc.next();
			String mm = birth.substring(2,4);
			int m = Integer.parseInt(mm);
			String dd = birth.substring(4,6);
			int d = Integer.parseInt(dd);
			if(birth.length() == 6 && ( m > 0 && m <= 12) && (d>0 && d <=31)) {
				yy = birth.substring(0,2);
			break;
			}
			System.out.println("다시 입력해 주세요");
			}
			int y = Integer.parseInt(yy);
			if ( y >= 23 && y <= 24 ) {      // 청소년과 중복방지를 위해 100세 이상 성인은 배제
				System.out.println("다시 입력해주세요");
			} else if (y <23 && y >= 03) {   // 청소년
				age = 1;       
				break;
			} else if (y <= 02 || y > 82) {	 // 성인
				age = 2;
				break;
			} else if (y <= 82 && y > 24) {	 // 중장년층
				age = 3;
				break;
			} 
		} // age 입력 while
		System.out.println();
		
		while (true) {    // 성별을 입력받기 위한 while
			System.out.print("성별 (ex: 남자) : ");
			String gen2 = sc.next();
			if (gen2.contains("남자")) {
				gen = 1;
				break;
			} else if (gen2.contains("여자")) {
				gen = 2;
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
		} // gen 입력 while

		String skintype = ""; 	// 수를 입력받기 위한 변수 
		int dry = 0;       		// 건조한 정도를 저장할 변수
		int trouble = 0; 		// 트러블 정도를 저장할 변수
		int antiAge = 0;		// 주름 정도를 저장할 변수
		
		while (true) {  // 피부 고민을 받는 단계
			System.out.println();
			if ((age == 2 && gen == 2) || (age == 2 && gen == 1)) { // women // men
				while(true) {
				System.out.println("피부 고민을 모두 선택해주세요. ex) 12 / 32 / 123 ");
				System.out.println("1.보습	2.트러블	 3.안티에이징");
				skintype = sc.next();
					if(skintype.contains("1") || skintype.contains("2") || skintype.contains("3")) {
				if (skintype.contains("1")) {
					dry = 1;
				} 
				if(skintype.contains("2")) {
					trouble = 1;
				} 
				if(skintype.contains("3")) {
					antiAge = 1;
				} break;
					} else {
						System.out.println("다시 입력해 주세요");
					}
				}
			} else if ((age == 3 && gen == 2) || (age == 3 && gen == 1)) { // oldwomen, oldmen
				while(true) {
				System.out.println("피부 고민을 모두 선택해주세요. ex) 12 / 1  ");
				System.out.println("1.보습	2.안티에이징");
				skintype = sc.next();
				if(skintype.contains("1") || skintype.contains("2")) {
				if (skintype.contains("1")) {
					dry = 1;
				} 
				if(skintype.contains("2")) {
					antiAge = 1;
				} break;
				} else {
					System.out.println("다시 입력해주세요");
				}
				}
			} else {
				break;
			}
			break;
		}  // 피부 고민 선택
		
		int cosmetic_type = 0;  //( 토너 : 1 , 로션 : 2, 올인원 : 3, 에센스 :4 , 크림 : 5
		int dryPoint = 0;		// 사용자가 입력한 건조한 값을 저장할 변수
		int troublePoint = 0;	// 사용자가 입력한 트러블정도를 저장할 변수
		int antiPoint = 0;		// 사용자가 입력한 주름 정도를 저장할 변수
		
		
//		------------------------------------------청소년-------------------------------
		while (age == 1) {
			while (true) {
				System.out.println();
				System.out.println("어떤 화장품을 찾으시나요? (해당 번호를 하나만 입력하세요)");
				System.out.println(" 1번 : 토너 \n 2번 : 로션");
				String cos = sc.next();
				if (cos.contains("1")) {
					System.out.println();
					System.out.println("토너를 추천해 드릴게요.");
					cosmetic_type = 1;
					break;
				} 
				if (cos.contains("2")) {
					System.out.println();
					System.out.println("로션을 추천해 드릴게요.");
					cosmetic_type = 2;
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}
			}
			while(true) {  // 건조한 정도를 입력받아 저장하기 위한 while
				System.out.println("피부 건조함을 입력해주세요.\n 1(건조함)<< 정도 >>(건조하지않음)5");
				int iDry = sc.nextInt();
				if(iDry <= 5 && iDry >= 1) {
					dryPoint = iDry;
					break;
				} else { System.out.println("다시 입력해주세요");}
			}
			if(dryPoint == 1 && cosmetic_type == 1) {        // 청소년 토너
				System.out.println("추천될 토너는 " + cosC.toner(dryPoint) + "입니다.");
			} else if (dryPoint == 2 && cosmetic_type == 1) {
				System.out.println("추천될 토너는 " + cosC.toner(dryPoint) + "입니다.");
			} else if (dryPoint == 3 && cosmetic_type == 1) {
				System.out.println("추천될 토너는 " + cosC.toner(dryPoint) + "입니다.");
			} else if (dryPoint == 4 && cosmetic_type == 1) {
				System.out.println("추천될 토너는 " + cosC.toner(dryPoint) + "입니다.");
			} else if (dryPoint == 5 && cosmetic_type == 1) {
				System.out.println("추천될 토너는 " + cosC.toner(dryPoint) + "입니다.");
			} 
			
			if(dryPoint == 1 && cosmetic_type == 2) {		//청소년 로션
				System.out.println("추천될 로션는 " + cosC.lotion(dryPoint) + "입니다.");
			} else if (dryPoint == 2 && cosmetic_type == 2) {
				System.out.println("추천될 로션는 " + cosC.lotion(dryPoint) + "입니다.");
			} else if (dryPoint == 3 && cosmetic_type == 2) {
				System.out.println("추천될 로션는 " + cosC.lotion(dryPoint) + "입니다.");
			} else if (dryPoint == 4 && cosmetic_type == 2) {
				System.out.println("추천될 로션는 " + cosC.lotion(dryPoint) + "입니다.");
			} else if (dryPoint == 5 && cosmetic_type == 2) {
				System.out.println("추천될 로션는 " + cosC.lotion(dryPoint) + "입니다.");
			} 
			break;
		} // 청소년용
		
//		------------------------------------------청소년-------------------------------
//		------------------------------------------men-------------------------------
		
		while (age == 2 && gen == 1) {
			while (true) {
				System.out.println();
				System.out.println("어떤 화장품을 찾으시나요? (해당 번호를 하나만 입력하세요)");
				System.out.println(" 1번 : 토너 \n 2번 : 로션 \n 3번 : 올인원");
				String cos = sc.next();
				if (cos.contains("1")) {
					System.out.println("토너를 추천해 드릴게요.");
					System.out.println();
					cosmetic_type = 1;
					break;
				} else if (cos.contains("2")) {
					System.out.println("로션을 추천해 드릴게요.");
					System.out.println();
					cosmetic_type = 2;
					break;
				} else if (cos.contains("3")) {
					System.out.println("올인원을 추천해 드릴게요.");
					System.out.println();
					cosmetic_type = 3;
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}
			}
			while (dry == 1) { 
				System.out.println("피부 건조함을 입력해주세요.\n 1(건조함)<< 정도 >>(건조하지않음)5");
				int iDry = sc.nextInt();
				if (iDry <= 5 && iDry >= 1) {
					dryPoint = iDry;
					break;
				} else {
					System.out.println("다시 입력해주세요");
				}
			}
			while (trouble == 1) { // 트러블 정도를 입력받아 저장하기 위한 while
				System.out.println();
				System.out.println("피부 트러블을 입력해주세요.\n 1(트러블 적음)<< 정도 >>(트러블 많음)5");
				int iTrouble = sc.nextInt();
				if (iTrouble <= 5 && iTrouble >= 1) {
					troublePoint = iTrouble;
					break;
				} else {
					System.out.println("다시 입력해주세요");
				}
			}
			while (antiAge == 1) { // 주름 정도를 입력받아 저장하기 위한 while
				System.out.println();
				System.out.println("주름 상태을 입력해주세요.\n 1(적음)<< 정도 >>(많음)5");
				int iAnti = sc.nextInt();
				if (iAnti <= 5 && iAnti >= 1) {
					antiPoint = iAnti;
					break;
				} else {
					System.out.println("다시 입력해주세요");
				}
			}

			while (cosmetic_type == 1) { // -----------토너 // 사용자가 원하는 화장품 종류
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 토너는 " + cosM.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 토너는 " + cosM.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 토너는 " + cosM.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 토너는 " + cosM.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 토너는 " + cosM.toner1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (troublePoint != 0) {
					if (troublePoint == 1) { // 토너
						System.out.println("추천될 토너는 " + cosM.toner2(troublePoint) + "입니다.");
					} else if (troublePoint == 2) {
						System.out.println("추천될 토너는 " + cosM.toner2(troublePoint) + "입니다.");
					} else if (troublePoint == 3) {
						System.out.println("추천될 토너는 " + cosM.toner2(troublePoint) + "입니다.");
					} else if (troublePoint == 4) {
						System.out.println("추천될 토너는 " + cosM.toner2(troublePoint) + "입니다.");
					} else if (troublePoint == 5) {
						System.out.println("추천될 토너는 " + cosM.toner2(troublePoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) { // 토너
						System.out.println("추천될 토너는 " + cosM.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 토너는 " + cosM.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 토너는 " + cosM.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 토너는 " + cosM.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 토너는 " + cosM.toner3(antiPoint) + "입니다.");
					}
					break;
				}
				break;
			}  // 토너

			while (cosmetic_type == 2) { // -----------로션
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 로션은 " + cosM.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 로션은 " + cosM.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 로션은 " + cosM.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 로션은 " + cosM.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 로션은 " + cosM.lotion1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (troublePoint != 0) {
					if (troublePoint == 1) {
						System.out.println("추천될 로션은 " + cosM.lotion2(troublePoint) + "입니다.");
					} else if (troublePoint == 2) {
						System.out.println("추천될 로션은 " + cosM.lotion2(troublePoint) + "입니다.");
					} else if (troublePoint == 3) {
						System.out.println("추천될 로션은 " + cosM.lotion2(troublePoint) + "입니다.");
					} else if (troublePoint == 4) {
						System.out.println("추천될 로션은 " + cosM.lotion2(troublePoint) + "입니다.");
					} else if (troublePoint == 5) {
						System.out.println("추천될 로션은 " + cosM.lotion2(troublePoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) {
						System.out.println("추천될 로션은 " + cosM.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 로션은 " + cosM.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 로션은 " + cosM.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 로션은 " + cosM.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 로션은 " + cosM.lotion3(antiPoint) + "입니다.");
					}
					break;
				}

				break;
			}  // 로션
			
			while (cosmetic_type == 3) { // ----------- 올인원
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 올인원은 " + cosM.allInOne1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 올인원은 " + cosM.allInOne1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 올인원은 " + cosM.allInOne1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 올인원은 " + cosM.allInOne1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 올인원은 " + cosM.allInOne1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (troublePoint != 0) {
					if (troublePoint == 1) {
						System.out.println("추천될 올인원은 " + cosM.allInOne2(troublePoint) + "입니다.");
					} else if (troublePoint == 2) {
						System.out.println("추천될 올인원은 " + cosM.allInOne2(troublePoint) + "입니다.");
					} else if (troublePoint == 3) {
						System.out.println("추천될 올인원은 " + cosM.allInOne2(troublePoint) + "입니다.");
					} else if (troublePoint == 4) {
						System.out.println("추천될 올인원은 " + cosM.allInOne2(troublePoint) + "입니다.");
					} else if (troublePoint == 5) {
						System.out.println("추천될 올인원은 " + cosM.allInOne2(troublePoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) {
						System.out.println("추천될 올인원은 " + cosM.allInOne3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 올인원은 " + cosM.allInOne3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 올인원은 " + cosM.allInOne3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 올인원은 " + cosM.allInOne3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 올인원은 " + cosM.allInOne3(antiPoint) + "입니다.");
					}
					break;
				}

				break;
			} // 올인원
			break;
		} // men
		
		
//		------------------------------------------men-------------------------------
//		------------------------------------------oldmen------------------------------
		
		while (age == 3 && gen == 1) {
			while (true) {
				System.out.println();
				System.out.println("어떤 화장품을 찾으시나요? (해당 번호를 하나만 입력하세요)");
				System.out.println(" 1번 : 토너 \n 2번 : 로션 \n 3번 : 올인원");
				String cos = sc.next();
				if (cos.contains("1")) {
					System.out.println("토너를 추천해 드릴게요.");
					cosmetic_type = 1;
					break;
				} else if (cos.contains("2")) {
					System.out.println("로션을 추천해 드릴게요.");
					cosmetic_type = 2;
					break;
				} else if (cos.contains("3")) {
					System.out.println("올인원을 추천해 드릴게요.");
					cosmetic_type = 3;
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}
				break;
			}
			while (dry == 1) {
				System.out.println();
				System.out.println("피부 건조함을 입력해주세요.\n 1(건조함)<< 정도 >>(건조하지않음)5");
				int iDry = sc.nextInt();
				if (iDry <= 5 && iDry >= 1) {
					dryPoint = iDry;
				} else {
					System.out.println("다시 입력해주세요");
				}
				break;
			}
			while (antiAge == 1) {
				System.out.println();
				System.out.println("주름 상태을 입력해주세요.\n 1(적음)<< 정도 >>(많음)5");
				int iAnti = sc.nextInt();
				if (iAnti <= 5 && iAnti >= 1) {
					antiPoint = iAnti;
				} else {
					System.out.println("다시 입력해주세요");
				}
				break;
			}
		
			while (cosmetic_type == 1) { // -----------토너
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 토너는 " + cosOM.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 토너는 " + cosOM.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 토너는 " + cosOM.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 토너는 " + cosOM.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 토너는 " + cosOM.toner1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) { 
						System.out.println("추천될 토너는 " + cosOM.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 토너는 " + cosOM.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 토너는 " + cosOM.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 토너는 " + cosOM.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 토너는 " + cosOM.toner3(antiPoint) + "입니다.");
					}
					break;
				}
				break;
			}  // 토너
			while (cosmetic_type == 2) { // -----------로션
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 로션은 " + cosOM.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 로션은 " + cosOM.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 로션은 " + cosOM.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 로션은 " + cosOM.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 로션은 " + cosOM.lotion1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) {
						System.out.println("추천될 로션은 " + cosOM.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 로션은 " + cosOM.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 로션은 " + cosOM.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 로션은 " + cosOM.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 로션은 " + cosOM.lotion3(antiPoint) + "입니다.");
					}
					break;
				}

				break;
			}  // 로션
			
			while (cosmetic_type == 3) { // ----------- 올인원
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 올인원은 " + cosOM.allInOne1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 올인원은 " + cosOM.allInOne1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 올인원은 " + cosOM.allInOne1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 올인원은 " + cosOM.allInOne1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 올인원은 " + cosOM.allInOne1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) {
						System.out.println("추천될 올인원은 " + cosOM.allInOne3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 올인원은 " + cosOM.allInOne3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 올인원은 " + cosOM.allInOne3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 올인원은 " + cosOM.allInOne3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 올인원은 " + cosOM.allInOne3(antiPoint) + "입니다.");
					}
					break;
				}

				break;
			} // 올인원			
			break;
		} // old men
		
//		------------------------------------------oldmen------------------------------
//		------------------------------------------women------------------------------

		while (age == 2 && gen == 2) {
			while (true) {
				System.out.println();
				System.out.println("어떤 화장품을 찾으시나요? (해당 번호를 하나만 입력하세요)");
				System.out.println(" 1번 : 토너 \n 2번 : 에센스 \n 3번 : 로션  \n 4번 : 크림");
				String cos = sc.next();
				if (cos.contains("1")) {
					System.out.println("토너를 추천해 드릴게요.");
					cosmetic_type = 1;
					break;
				} else if (cos.contains("2")) {
					System.out.println("에센스를 추천해 드릴게요.");
					cosmetic_type = 4;
					break;
				} else if (cos.contains("3")) {
					System.out.println("로션을 추천해 드릴게요.");
					cosmetic_type = 2;
					break;
				} else if (cos.contains("4")) {
					System.out.println("크림을 추천해 드릴게요.");
					cosmetic_type = 5;
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}
				break;
			}
			while (dry == 1) {
				System.out.println();
				System.out.println("피부 건조함을 입력해주세요.\n 1(건조함)<< 정도 >>(건조하지않음)5");
				int iDry = sc.nextInt();
				if (iDry <= 5 && iDry >= 1) {
					dryPoint = iDry;
				} else {
					System.out.println("다시 입력해주세요");
				}
				break;
			}
			while (trouble == 1) {
				System.out.println();
				System.out.println("피부 트러블을 입력해주세요.\n 1(트러블 적음)<< 정도 >>(트러블 많음)5");
				int iTrouble = sc.nextInt();
				if (iTrouble <= 5 && iTrouble >= 1) {
					troublePoint = iTrouble;
				} else {
					System.out.println("다시 입력해주세요");
				}
				break;
			}
			while (antiAge == 1) {
				System.out.println();
				System.out.println("주름 상태을 입력해주세요.\n 1(적음)<< 정도 >>(많음)5");
				int iAnti = sc.nextInt();
				if (iAnti <= 5 && iAnti >= 1) {
					antiPoint = iAnti;
				} else {
					System.out.println("다시 입력해주세요");
				}
				break;
			}

			while (cosmetic_type == 1) { // -----------토너
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 토너는 " + cosW.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 토너는 " + cosW.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 토너는 " + cosW.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 토너는 " + cosW.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 토너는 " + cosW.toner1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (troublePoint != 0) {
					if (troublePoint == 1) { // 토너
						System.out.println("추천될 토너는 " + cosW.toner2(troublePoint) + "입니다.");
					} else if (troublePoint == 2) {
						System.out.println("추천될 토너는 " + cosW.toner2(troublePoint) + "입니다.");
					} else if (troublePoint == 3) {
						System.out.println("추천될 토너는 " + cosW.toner2(troublePoint) + "입니다.");
					} else if (troublePoint == 4) {
						System.out.println("추천될 토너는 " + cosW.toner2(troublePoint) + "입니다.");
					} else if (troublePoint == 5) {
						System.out.println("추천될 토너는 " + cosW.toner2(troublePoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) { // 토너
						System.out.println("추천될 토너는 " + cosW.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 토너는 " + cosW.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 토너는 " + cosW.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 토너는 " + cosW.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 토너는 " + cosW.toner3(antiPoint) + "입니다.");
					}
					break;
				}
				break;
			} // 토너

			while (cosmetic_type == 2) { // -----------로션
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 로션은 " + cosW.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 로션은 " + cosW.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 로션은 " + cosW.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 로션은 " + cosW.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 로션은 " + cosW.lotion1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (troublePoint != 0) {
					if (troublePoint == 1) {
						System.out.println("추천될 로션은 " + cosW.lotion2(troublePoint) + "입니다.");
					} else if (troublePoint == 2) {
						System.out.println("추천될 로션은 " + cosW.lotion2(troublePoint) + "입니다.");
					} else if (troublePoint == 3) {
						System.out.println("추천될 로션은 " + cosW.lotion2(troublePoint) + "입니다.");
					} else if (troublePoint == 4) {
						System.out.println("추천될 로션은 " + cosW.lotion2(troublePoint) + "입니다.");
					} else if (troublePoint == 5) {
						System.out.println("추천될 로션은 " + cosW.lotion2(troublePoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) {
						System.out.println("추천될 로션은 " + cosW.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 로션은 " + cosW.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 로션은 " + cosW.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 로션은 " + cosW.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 로션은 " + cosW.lotion3(antiPoint) + "입니다.");
					}
					break;
				}

				break;
			} // 로션

			while (cosmetic_type == 4) { // -----------에센스
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 에센스는 " + cosW.essence1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 에센스는 " + cosW.essence1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 에센스는 " + cosW.essence1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 에센스는 " + cosW.essence1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 에센스는 " + cosW.essence1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (troublePoint != 0) {
					if (troublePoint == 1) {
						System.out.println("추천될 에센스는 " + cosW.essence2(troublePoint) + "입니다.");
					} else if (troublePoint == 2) {
						System.out.println("추천될 에센스는 " + cosW.essence2(troublePoint) + "입니다.");
					} else if (troublePoint == 3) {
						System.out.println("추천될 에센스는 " + cosW.essence2(troublePoint) + "입니다.");
					} else if (troublePoint == 4) {
						System.out.println("추천될 에센스는 " + cosW.essence2(troublePoint) + "입니다.");
					} else if (troublePoint == 5) {
						System.out.println("추천될 에센스는 " + cosW.essence2(troublePoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) {
						System.out.println("추천될 에센스는 " + cosW.essence3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 에센스는 " + cosW.essence3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 에센스는 " + cosW.essence3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 에센스는 " + cosW.essence3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 에센스는 " + cosW.essence3(antiPoint) + "입니다.");
					}
					break;
				}

				break;
			} // 에센스
			System.out.println();
			while (cosmetic_type == 5) { // -----------크림
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 크림은 " + cosW.cream1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 크림은 " + cosW.cream1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 크림은 " + cosW.cream1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 크림은 " + cosW.cream1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 크림은 " + cosW.cream1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (troublePoint != 0) {
					if (troublePoint == 1) {
						System.out.println("추천될 크림은 " + cosW.cream2(troublePoint) + "입니다.");
					} else if (troublePoint == 2) {
						System.out.println("추천될 크림은 " + cosW.cream2(troublePoint) + "입니다.");
					} else if (troublePoint == 3) {
						System.out.println("추천될 크림은 " + cosW.cream2(troublePoint) + "입니다.");
					} else if (troublePoint == 4) {
						System.out.println("추천될 크림은 " + cosW.cream2(troublePoint) + "입니다.");
					} else if (troublePoint == 5) {
						System.out.println("추천될 크림은 " + cosW.cream2(troublePoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) {
						System.out.println("추천될 크림은 " + cosW.cream3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 크림은 " + cosW.cream3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 크림은 " + cosW.cream3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 크림은 " + cosW.cream3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 크림은 " + cosW.cream3(antiPoint) + "입니다.");
					}
					break;
				}
				break;
			} // 크림
			break;
		} // women
//		------------------------------------------women------------------------------
//		------------------------------------------oldwomen------------------------------
		
		while (age == 3 && gen == 2) {
			while (true) {
				System.out.println();
				System.out.println("어떤 화장품을 찾으시나요? (해당 번호를 하나만 입력하세요)");
				System.out.println(" 1번 : 토너 \n 2번 : 에센스 \n 3번 : 로션  \n 4번 : 크림");
				String cos = sc.next();
				if (cos.contains("1")) {
					System.out.println("토너를 추천해 드릴게요.");
					System.out.println();
					cosmetic_type = 1;
					break;
				} else if (cos.contains("2")) {
					System.out.println("에센스를 추천해 드릴게요.");
					System.out.println();
					cosmetic_type = 4;
					break;
				} else if (cos.contains("3")) {
					System.out.println("로션을 추천해 드릴게요.");
					System.out.println();
					cosmetic_type = 2;
					break;
				} else if (cos.contains("4")) {
					System.out.println("크림을 추천해 드릴게요.");
					System.out.println();
					cosmetic_type = 5;
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}
				break;
			}
			while (dry == 1) {
				System.out.println();
				System.out.println("피부 건조함을 입력해주세요.\n 1(건조함)<< 정도 >>(건조하지않음)5");
				int iDry = sc.nextInt();
				if (iDry <= 5 && iDry >= 1) {
					dryPoint = iDry;
				} else {
					System.out.println("다시 입력해주세요");
				}
				break;
			}
			while (antiAge == 1) {
				System.out.println();
				System.out.println("주름 상태을 입력해주세요.\n 1(적음)<< 정도 >>(많음)5");
				System.out.println();
				int iAnti = sc.nextInt();
				if (iAnti <= 5 && iAnti >= 1) {
					antiPoint = iAnti;
				} else {
					System.out.println("다시 입력해주세요");
				}
				break;
			}

			while (cosmetic_type == 1) { // -----------토너
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 토너는 " + cosOW.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 토너는 " + cosOW.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 토너는 " + cosOW.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 토너는 " + cosOW.toner1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 토너는 " + cosOW.toner1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) { // 토너
						System.out.println("추천될 토너는 " + cosOW.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 토너는 " + cosOW.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 토너는 " + cosOW.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 토너는 " + cosOW.toner3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 토너는 " + cosOW.toner3(antiPoint) + "입니다.");
					}
					break;
				}
				break;
			} // 토너

			while (cosmetic_type == 2) { // -----------로션
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 로션은 " + cosOW.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 로션은 " + cosOW.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 로션은 " + cosOW.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 로션은 " + cosOW.lotion1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 로션은 " + cosOW.lotion1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) {
						System.out.println("추천될 로션은 " + cosOW.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 로션은 " + cosOW.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 로션은 " + cosOW.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 로션은 " + cosOW.lotion3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 로션은 " + cosOW.lotion3(antiPoint) + "입니다.");
					}
					break;
				}

				break;
			} // 로션

			while (cosmetic_type == 4) { // -----------에센스
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 에센스는 " + cosOW.essence1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 에센스는 " + cosOW.essence1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 에센스는 " + cosOW.essence1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 에센스는 " + cosOW.essence1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 에센스는 " + cosOW.essence1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) {
						System.out.println("추천될 에센스는 " + cosOW.essence3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 에센스는 " + cosOW.essence3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 에센스는 " + cosOW.essence3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 에센스는 " + cosOW.essence3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 에센스는 " + cosOW.essence3(antiPoint) + "입니다.");
					}
					break;
				}

				break;
			} // 에센스

			while (cosmetic_type == 5) { // -----------크림
				while (dryPoint != 0) {
					if (dryPoint == 1) {
						System.out.println("추천될 크림은 " + cosOW.cream1(dryPoint) + "입니다.");
					} else if (dryPoint == 2) {
						System.out.println("추천될 크림은 " + cosOW.cream1(dryPoint) + "입니다.");
					} else if (dryPoint == 3) {
						System.out.println("추천될 크림은 " + cosOW.cream1(dryPoint) + "입니다.");
					} else if (dryPoint == 4) {
						System.out.println("추천될 크림은 " + cosOW.cream1(dryPoint) + "입니다.");
					} else if (dryPoint == 5) {
						System.out.println("추천될 크림은 " + cosOW.cream1(dryPoint) + "입니다.");
					}
					break;
				}
				System.out.println();
				while (antiPoint != 0) {
					if (antiPoint == 1) {
						System.out.println("추천될 크림은 " + cosOW.cream3(antiPoint) + "입니다.");
					} else if (antiPoint == 2) {
						System.out.println("추천될 크림은 " + cosOW.cream3(antiPoint) + "입니다.");
					} else if (antiPoint == 3) {
						System.out.println("추천될 크림은 " + cosOW.cream3(antiPoint) + "입니다.");
					} else if (antiPoint == 4) {
						System.out.println("추천될 크림은 " + cosOW.cream3(antiPoint) + "입니다.");
					} else if (antiPoint == 5) {
						System.out.println("추천될 크림은 " + cosOW.cream3(antiPoint) + "입니다.");
					}
					break;
				}
				break;
			} // 크림
			break;
		} // women

//		------------------------------------------oldwomen------------------------------

		System.out.println();
		System.out.println("결과가 도움이 되셨나요?");
		System.out.println("도움이 되셨다면 점수를 입력해주세요( 0 ~ 10)");
		
		int point = sc.nextInt();
		String star = "";
		for (int i = 1 ; i <= point ; i++) {
			star += "*";
		} 
		System.out.println(star + "이용해주셔서 감사합니다." + star);
		
		
		
		
		
		sc.close();
		

	}  //main

} //class
