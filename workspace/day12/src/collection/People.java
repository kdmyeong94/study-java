package collection;

// 주소록 데이터를 표현하기 위한 javabean

public class People {

	private String name;
	private String phoneNumber;
	public People(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
