package Test;

import java.util.Scanner;

public class Lotto_check {

	private String password;
	private int number;
	private int maxcheck = 3;
	private int check = 0;

	public int password_check(Scanner sc) {
		while (check <= maxcheck) {
			System.out.println("$$$$$$$ 결제 비밀번호를 입력해주세요$$$$$$$");
			this.password = sc.next();
			/*	
			if(check_password(this.password)) { // getPwd로 지금 비번과 맞는지 비교, getPwd() == this.password
				return this.number;
			}else {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				check++;
			}
			*/
		}
		System.out.println("비밀번호 3회 틀렸습니다. 시스템을 종료합니다.");
		return 0;
	}
	public int[] auto_lotto(int number) {   //RANDOM 좀더 구상해 볼것 
		this.number = number;
		
		int [][] lotto_paper = new int[number][6];
		int [][] t = new int[number][6];
		
		for(int i = 0; i < number; i++) {
			for(int j = 0; j < 6; j++) {
				// 기능 구현
			}
		}
	}
	// return 값 보내주기
}