package Test;

public class Lotto_User { // 정보를 넘겨주기 위함
	private String name;
	private int year;
	private int month;
	private int day;
	private String pwd;

	public void User(String name, int year, int month, int day, String pwd) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.pwd = pwd;
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int getBirthMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String getPassword() {
		return pwd;
	}
}
