package Test;

public class Lotto_User { // 정보를 넘겨주기 위함
	private String name;
	private int year;
	private int month;
	private int day;
	private String address;
	private String pwd;

	public void User(String name, int year, int month, int day, String address, String pwd) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.address = address;
		this.pwd = pwd;
	}

	// Getter methods
	public String getName() {return name;}
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDay() {return day;}
	public String getAddress() {return address;}
	public String getPwd() {return pwd;}

	// Setter methods 구현
	public void setName(String name) {	this.name = name;}
	public void setYear(int year) {this.year = year;}
	public void setMonth(int month) {this.month = month;}
	public void setDay(int day) {this.day = day;}
	public void setAddress(String address) {this.address = address;}
	public void setPwd(String pwd) {this.pwd = pwd;}

}
