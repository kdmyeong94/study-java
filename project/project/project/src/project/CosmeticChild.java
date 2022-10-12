package project;

public class CosmeticChild {


	
	
	public String toner(int a) {  //건조한 정도를 정수값으로 받아와서 해당 토너 정하기
		
		String[] cos = {"청소년용토너1","청소년용토너2","청소년용토너3","청소년용토너4","청소년용토너5"}; // 토너 종류
		
		 String b = "";  // 추천될 토너를 담을 변수
		switch (a) { // 건조한 정도에 따라서 토너 정하기 위한 조건문
		case 1: { b = cos[0]+", " +cos[1]; break;}
		case 2: { b = cos[0]+", " +cos[1]+", " +cos[2]; break;}
		case 3: { b = cos[1]+", " +cos[2]+", " +cos[3]; break;}	
		case 4: { b = cos[2]+", " +cos[3]+", " +cos[4]; break;}
		case 5: { b = cos[3]+", " +cos[4]; break;}	
		}
		return b; // 토너값 출력
	} //toner
	
	
	public String lotion(int a) {  //건조한 정도를 정수값으로 받아와서 해당 로션 정하기
		
		String[] cos = {"청소년용로션1","청소년용로션2","청소년용로션3","청소년용로션4","청소년용로션5"}; // 로션 종류
		
		 String b = "";  // 추천될 로션를 담을 변수
		switch (a) { // 건조한 정도에 따라서 로션 정하기 위한 조건문
		case 1: { b = cos[0]+", " +cos[1]; break;}
		case 2: { b = cos[0]+", " +cos[1]+", " +cos[2]; break;}
		case 3: { b = cos[1]+", " +cos[2]+", " +cos[3]; break;}	
		case 4: { b = cos[2]+", " +cos[3]+", " +cos[4]; break;}
		case 5: { b = cos[3]+", " +cos[4]; break;}	
		}
		return b; // 로션값 출력

	} // lotion
	
	
	
} // class
