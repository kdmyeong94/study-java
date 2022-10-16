package day02;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl + d : 한 라인 지우기
		// ctrl + alt + 방향키 : 라인복제
//		System.out.printf("오늘은 %d일 입니다.\n", 15);
//		System.out.printf("오늘은 %10d일 입니다.\n", 15);
//		System.out.printf("오늘은 %010d일 입니다.\n", 15);
//		System.out.printf("오늘은 %-10d일 입니다.\n", 15);
//		System.out.printf("제 키는 %f입니다.\n", 200.5);
//		System.out.printf("제 키는 %10f입니다.\n", 200.5);
//		System.out.printf("제 키는 %10.1f입니다.\n", 200.5);
//		System.out.printf("이곳은 %c강의실입니다.\n",'C');
//		System.out.printf("제 이름은 %s입니다.\n", "김동명");
//		System.out.printf("제 이름은 %10s입니다.\n", "김동명");
//		System.out.printf("제 이름은 %10.2s입니다.\n", "김동명");
		
		//여러개 형식지정자가 사용되면 순서대로 전달한다.
//		System.out.printf("%s %d %c %f \n", "안녕", 10, 'A', 190.9);
		
//		안녕하세요 저는 "김참이"입니다.
//		나이는 "20살"이구요
//		저는 "C"강의장에 있습니다.
//		제 키는 "199.9" 입니다.
		
		System.out.printf("안녕하세요 저는 \"%s\"입니다.\n", "김참이");
		System.out.printf("나이는 \"%d살\"이구요.\n", 20);
		System.out.printf("저는 \"%c\"강의장에 있습니다.\n", 'C');
		System.out.printf("제 키는 \"%.1f\" 입니다. \n", 199.9);
		
		System.out.printf("안녕하세요 저는 %s입니다.\n 나이는 %d살 이구요.\n 저는 %c강의장에 있습니다. \n 제 키는 %.1f 입니다.", "김참이", 20, 'C', 199.9);
		
	
		
		
		
		
		
		
		
	}

}
