package jcf;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest2 {

	public static void main(String[] args) {

		
		HashMap<String, String> members = new HashMap<>();
		
		members.put("abcd", "1234");
		members.put("abcd1", "1234");
		members.put("abcd2", "1234");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id > ");
			String id = sc.nextLine().trim(); // trim() 좌우 공백 제거
			
			System.out.println("pw > ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			if(!members.containsKey(id)) { // Map에 id에 해당하는 key 값이 없을 때,
				System.out.println("입력하신 id는 존재하지 않습니다.");
				continue;
			} else {// 입력한 id가 Map의 key 값에 일치하는 값이 있을 때
				if(!members.get(id).equals(pw)) { // 입력한 id에 대한 비밀번호가 일치하지 않다면
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else { // id와 pw가 일치 할 때
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
			
			
		}
		
	}
		
}

