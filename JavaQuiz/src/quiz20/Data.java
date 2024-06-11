package quiz20;

public class Data {
	
	private String name;
	private String age;
	private String email;
	private String way;
	public Data(String name, String age, String email, String way) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.way = way;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", email=" + email + ", way=" + way + "]";
	}
	
}
