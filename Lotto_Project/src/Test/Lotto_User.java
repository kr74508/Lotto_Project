package Test;

public class Lotto_User { // 정보를 넘겨주기 위함
	private String name;
	private String id;
	private String password;
	private int birthYear;

	public void User(String name, String id, String password, int birthYear) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.birthYear = birthYear;
    }

	// Getter methods
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public int getBirthYear() {
		return birthYear;
	}
}
