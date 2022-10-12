package overload;

public class Member {

	private String job;
	private int age;
	
	Member(){
		
	}
	Member(int age){
		this.age = age;
	}
	Member(String job){
		this.job = job;
	}
	Member(String job, int age){
		this.job = job;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [job=" + job + ", age=" + age + "]";
	}
	
	
	
}
