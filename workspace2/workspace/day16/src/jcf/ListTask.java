package jcf;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<User> members = new ArrayList<>();
		
		
		while(true) {
			
			
			System.out.println("==================");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원정보 입력");
			System.out.println("4. 나가기");
			System.out.println("==================");
			
			
			System.out.println("입력 > ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) { // 회원가입
				Boolean isConflict = false;
				System.out.println("-----회원가입 페이지----");
				System.out.println("아이디 : ");
				String id = sc.nextLine();
				System.out.println("비밀번호 : ");
				String pw = sc.nextLine();
				System.out.println("이름 : ");
				String name = sc.nextLine();
				System.out.println("나이 : ");
				int age;
				
				try {
					age = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					e.printStackTrace();
					System.out.println("나이에는 숫자만 입력해 주세요.");
					break;
				}
				
				// ArrayList 속에 id가 지금 회원가입하고자 하는
				// id랑 중복된다면 회원가입 실패
				for(int i = 0; i < members.size(); i++) {
					if(members.get(i).getId().equals(id)) { // 중복된 id라면
						System.out.println("중복된 id가 존재합니다.");
						isConflict = true;
						break;
					}
				}
				
				// 회원가입
				// id가 중복되지 않은 경우에만 실행
				if(!isConflict) {
					
					User u = new User();
					u.setId(id);
					u.setPw(pw);
					u.setName(name);
					u.setAge(age);
					
					members.add(u);
					System.out.println("회원가입 성공!");
				}
				
				
			} else if (choice == 2) { // 로그인
				
				boolean isLogin = false;
				System.out.println("----로그인 페이지----");
				System.out.println("id : ");
				String id = sc.nextLine();
				System.out.println("pw : ");
				String pw = sc.nextLine();
				
				// 이미 회원가입된 아이디 정보와 비밀번호 정보가
				// 지금 입력한 id와 pw 변수에 들어있는 값과 같다면
				// 로그인 성공, 000님 환영합니다.
				// 로그인 실패하면 아이디 또는 비밀번호자 잘못 입력 되었습니다. 출력
				// 메인메뉴 이동
				for(User user : members) { 
					if(user.getId().equals(id) && user.getPw().equals(pw)) {
						System.out.println("로그인 성공");
						System.out.println(user.getName() + " 님 환영합니다.");
						isLogin = true;
						break;
					}
					
					//로그인 실패했을때
					if(!isLogin) {
						System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
					}
					
				}
				
				
				
			} else if (choice == 3) { // 회원정보 입력
				
				boolean isUser = false;
				System.out.println("id : ");
				String id = sc.nextLine();
				
				for( User user : members) {
					if(user.getId().equals(id)) {
						System.out.println("--회원정보--");
						System.out.println("이름 : " + user.getName());
						System.out.println("나이 : " + user.getAge());
						isUser = true;
						break;
					}
				}
				
				// 검색 결과 없을 때 
				if(!isUser) {
					System.out.println("검색 결과가 존재하지 않습니다.");
				}
				
			} else if (choice == 4) { //나가기
				System.out.println("감사합니다.");
				break;
			} else { // 잘못된 입력
				System.out.println("잘못된 입력입니다.");
			}
			
			
		}
		
	}
}
