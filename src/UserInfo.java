
public class UserInfo {
	private String name;
	private String email;
	private String number;

	public UserInfo(String name, String email, String number) {
		this.name = name;
		this.email = email;
		this.number = number;
	}

	public String returnInfo() {
		return name + ", " + email + ", " + number;
	}
}
