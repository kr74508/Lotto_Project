package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto_check {

	private String password;
	private int maxcheck = 3;
	private int check = 0;

	public boolean password_check(Scanner sc, Lotto_User user) {
		while (check <= maxcheck) {
			System.out.println("$$$$$$$ 결제 비밀번호를 입력해주세요$$$$$$$");
			this.password = sc.next();
			if(this.password.equals(user.getPwd())) { // getPwd로 지금 비번과 맞는지 비교, getPwd() == this.password
				return true;
			}else {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				check++;
			}
		}
		System.out.println("비밀번호 3회 틀렸습니다. 시스템을 종료합니다.");
		return false;
	}
	public int[] auto_lotto() {   //RANDOM 좀더 구상해 볼것 
		int[] lotto = new int[6];
		Random rand = new Random();
		
		for(int i = 0; i < 6; i++) {
			int randNumber;
            boolean duplicate;
            do {
                randNumber = rand.nextInt(45) + 1;
                duplicate = false;

                // 배열에서 중복 확인
                for (int j = 0; j < i; j++) {
                    if (lotto[j] == randNumber) {
                        duplicate = true;
                        break;
                    }
                }
            } while (duplicate);

            lotto[i] = randNumber;
		}
		Arrays.sort(lotto); // 정렬 45, 1, 5, 4.. -> 1, 4, 5, 45 ..
		return lotto;
	}
}