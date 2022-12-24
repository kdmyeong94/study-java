package jcf;

import java.util.Arrays;

public class CodingTest {

	public static void main(String[] args) {
		
		// 마라톤 경기 참가자가 있다.
		// 하지만, 참가자들 중에 1명은 완주를 못한다.
		String[] completion = {"leo", "kiki", "eden"}; // 참가자
	    String[] paritipant = {"kiki", "eden"}; // 완주자
	    
		String[] completion2 = {"marina", "josipa", "nikola", "vinko", "flipa"}; //참가자
		String[] paritipant2 = {"marina", "josipa", "nikola", "flipa"}; // 완주자
		
		// 위의 배열을 사용해서 완주하지 못한 사람 이름을 출력하시오.
		
		// Hint.
		// Array.sort(배열) : 배열 안을 정리한다.
		// 문자열 정렬 : 첫글자의 알파벳순으로 정렬, 동일한 알파벳이라면 짧은게 우선순위
		
		System.out.println(Arrays.toString(completion));
		System.out.println(Arrays.toString(paritipant));
		
		String result = "";
		
		// 참가자와 완주자 두 배열을 같은 기준으로 정렬해준다.
		Arrays.sort(completion);
		Arrays.sort(paritipant);
		
		System.out.println(Arrays.toString(completion));
		System.out.println(Arrays.toString(paritipant));
		
		for(int i = 0; i < paritipant.length; i++) { // 참가자의 배열만큼 반복
			if(!completion[i].equals(paritipant[i])) { //
				result = completion[i];
			}
		}
		
		if(result.equals("")) { // 만약 for문 결과값이 아직 없다면
			result = completion[completion.length-1];
		}
		
		System.out.println(result);
	}
}
