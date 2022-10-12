package project;

public class CosmeticOldMen {


	public String toner1(int a) {  //건조한 정도를 정수값으로 받아와서 해당 토너 정하기
		
		String[] cos = {"토너1","토너2","토너3","토너4","토너5"}; // 토너 종류
		
		 String b = "";  // 추천될 토너를 담을 변수
		switch (a) { // 건조한 정도에 따라서 토너 정하기 위한 조건문
		case 1: { b = cos[0]+", " +cos[1]; break;}
		case 2: { b = cos[0]+", " +cos[1]+", " +cos[2]; break;}
		case 3: { b = cos[1]+", " +cos[2]+", " +cos[3]; break;}	
		case 4: { b = cos[2]+", " +cos[3]+", " +cos[4]; break;}
		case 5: { b = cos[3]+", " +cos[4]; break;}	
		}
		return b; // 토너값 출력
	} //toner1
	

	
	public String toner3(int a) {  //필요한 정도를 정수값으로 받아와서 해당 토너 정하기
		
		String[] cos = {"안티에이징토너1","안티에이징토너2","안티에이징토너3"
				,"안티에이징토너4","안티에이징토너5"}; // 안티에이징토너 종류
		
		 String b = "";  // 추천될 안티에이징토너를 담을 변수
		switch (a) { // 안티에이징토너 정하기 위한 조건문
		case 1: { b = cos[0]+", " +cos[1]; break;}
		case 2: { b = cos[0]+", " +cos[1]+", " +cos[2]; break;}
		case 3: { b = cos[1]+", " +cos[2]+", " +cos[3]; break;}	
		case 4: { b = cos[2]+", " +cos[3]+", " +cos[4]; break;}
		case 5: { b = cos[3]+", " +cos[4]; break;}	
		}
		return b; // 안티에이징토너값 출력
	} //toner3
	
	
	public String lotion1(int a) {  //건조한 정도를 정수값으로 받아와서 해당 로션 정하기
		
		String[] cos = {"로션1","로션2","로션3","로션4","로션5"}; // 로션 종류
		
		 String b = "";  // 추천될 로션를 담을 변수
		switch (a) { // 건조한 정도에 따라서 로션 정하기 위한 조건문
		case 1: { b = cos[0]+", " +cos[1]; break;}
		case 2: { b = cos[0]+", " +cos[1]+", " +cos[2]; break;}
		case 3: { b = cos[1]+", " +cos[2]+", " +cos[3]; break;}	
		case 4: { b = cos[2]+", " +cos[3]+", " +cos[4]; break;}
		case 5: { b = cos[3]+", " +cos[4]; break;}	
		}
		return b; // 로션값 출력

	} // lotion1
	

	
	public String lotion3(int a) {  // 정수값으로 받아와서 해당 로션 정하기
		
		String[] cos = {"안티에이징로션1","안티에이징로션2","안티에이징로션3"
				,"안티에이징로션4","안티에이징로션5"}; // 안티에이징로션 종류
		
		 String b = "";  // 추천될 안티에이징로션를 담을 변수
		switch (a) { // 안티에이징로션 정하기 위한 조건문
		case 1: { b = cos[0]+", " +cos[1]; break;}
		case 2: { b = cos[0]+", " +cos[1]+", " +cos[2]; break;}
		case 3: { b = cos[1]+", " +cos[2]+", " +cos[3]; break;}	
		case 4: { b = cos[2]+", " +cos[3]+", " +cos[4]; break;}
		case 5: { b = cos[3]+", " +cos[4]; break;}	
		}
		return b; // 안티에이징로션값 출력

	} // lotion3
	
	
	public String allInOne1(int a) {  //건조한 정도를 정수값으로 받아와서 해당 올인원 정하기
		
		String[] cos = {"올인원1","올인원2","올인원3","올인원4","올인원5"}; // 올인원 종류
		
		String b = "";  // 추천될 올인원를 담을 변수
		switch (a) { // 건조한 정도에 따라서 올인원 정하기 위한 조건문
		case 1: { b = cos[0]+", " +cos[1]; break;}
		case 2: { b = cos[0]+", " +cos[1]+", " +cos[2]; break;}
		case 3: { b = cos[1]+", " +cos[2]+", " +cos[3]; break;}	
		case 4: { b = cos[2]+", " +cos[3]+", " +cos[4]; break;}
		case 5: { b = cos[3]+", " +cos[4]; break;}	
		}
		return b; // 올인원값 출력
		
	} // allInOne1
	
	
	public String allInOne3(int a) {  //정수값으로 받아와서 해당 안티에이징올인원 정하기
		
		String[] cos = {"안티에이징올인원1","안티에이징올인원2","안티에이징올인원3"
				,"안티에이징올인원4","안티에이징올인원5"}; // 안티에이징 올인원 종류
		
		String b = "";  // 추천될 안티에이징올인원를 담을 변수
		switch (a) { // 안티에이징 올인원 정하기 위한 조건문
		case 1: { b = cos[0]+", " +cos[1]; break;}
		case 2: { b = cos[0]+", " +cos[1]+", " +cos[2]; break;}
		case 3: { b = cos[1]+", " +cos[2]+", " +cos[3]; break;}	
		case 4: { b = cos[2]+", " +cos[3]+", " +cos[4]; break;}
		case 5: { b = cos[3]+", " +cos[4]; break;}	
		}
		return b; // 안티에이징올인원값 출력
		
	} // allInOne3
	

	
} // class
