package user;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		User u1 = new User("abc1234", "1234", 10, "김철수");
//		User u2 = new User("abc12345", "5678", 15, "김영희");
//		User u3 = new User("abc123456", "5555", 20, "홍길동");
		
//		User[] users = {u1,u2,u3};
		
		User[] users = {
				new User("abc1234", "1234", 10, "김철수"),
				new User("abc12345", "5678", 15, "김영희"),
				new User("abc123456", "5555", 20, "홍길동")
		};
	
		System.out.println(users[0].getName());
		System.out.println(users[1].getName());
		System.out.println(users[2].getName());
		
		Scanner sc = new Scanner(System.in);
		int flag = 0; // 사용자가 선택한 번호
		String id = "";
		String pw = "";
		boolean isLogin = false;
		boolean isUser = false;
		
		while(true){
			System.out.println("1. 로그인하기");
			System.out.println("2. 회원정보보기");
			System.out.println("3. 종료하기");
			
			flag = sc.nextInt();
			sc.nextLine();
			
			if(flag== 1) {
				//로그인하기 구현
				System.out.println("id : ");
				id = sc.nextLine(); // 입력된 id 
				System.out.println("pw : ");
				pw = sc.nextLine(); // 입력된 pw
				
				// 1. Users 배열( 사용자목록) 을 반복문으로 돌며 입력받은 id, pw 일치하는지 확인
				// 2. 로그인 성공!
				// 3. 로그인 실패시, 아이디 또는 비밀번호가 존재하지 않습니다 출력하고 메인으로 이동.
				for(int i = 0; i<users.length;i++) {
					if(users[i].getId().equals(id) && users[i].getPw().equals(pw)) {
						System.out.println("로그인 성공");
						isLogin = true;
						System.out.println(users[i].getName() + "님 환영합니다.");
						break;
					}
				}
				// 로그인 실패시
				// 아이디 또는 비밀번호가 존재하지 않습니다 출력하고 메인으로 이동
				if(!isLogin) {
					System.out.println("아이디 또는 비밀번호가 존재하지 않습니다.");
				}
			} else if(flag==2){
				// 사용자 정보보기 구현			
				System.out.println("id >> ");
				id = sc.nextLine();
				
				// --- abc1234정보 ---
				// 이름 : 김철수 
				// 나이 : 10
				for(User user : users) {
					if(user.getId().equals(id)) {
						isUser = true; 
						System.out.println("이름 : " + user.getName());
						System.out.println("나이 : " + user.getAge());
					}
				}
				// 존재하지 않는 id를 입력했을때는
				// 안내문 출력 후 돌아가기
				if(!isUser) {
					System.out.println("존재하지 않는 아이디입니다.");
				}
			} else {
				//종료하기
				break;
			}
			
		}
		
		
	}
}
