package user;

public class User {

	private String id;
	private String pw;
	private int age;
	private String name;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public User(String id, String pw, int age, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.name = name;
	}
}
