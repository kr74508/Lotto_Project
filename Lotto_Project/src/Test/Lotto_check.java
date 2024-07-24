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
	public void machine_lotto(int[] number) {
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
	
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("사용자의 로또 번호는 " + Arrays.toString(number) + " 입니다.");
        System.out.println("당첨 번호는 " + Arrays.toString(lotto) + " 입니다.");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
        
        int count = 0;
        for (int ele1 : lotto) {
            for (int ele2 : number) {
                if (ele1 == ele2) {
                    count++;
                }
            }
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
        switch (count) {
            case 6:
                System.out.println("축하합니다! 1등입니다!");
                break;
            case 5:
                System.out.println("축하합니다! 2등입니다!");
                break;
            case 4:
                System.out.println("축하합니다! 3등입니다!");
                break;
            case 3:
                System.out.println("축하합니다! 4등입니다!");
                break;
            default:
                System.out.println("아쉽지만 당첨되지 않았습니다.");
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    
}