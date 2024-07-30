package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import lotto_project.Lotto_Result;

public class Main {

	public static void main(String[] args) {
		
		
		int[][] lotto = null; // 로또기능의 리턴값을 받기위한 배열 선언.
		int number = 0; // 장수를 입력받기위한 초깃값 
		
		Scanner scanner = new Scanner(System.in);
		Lotto_create lotto_cre = new Lotto_create();
		Lotto_test lotto_way = new Lotto_test();
		Lotto_join join = new Lotto_join(scanner); // 회원가입 <- 여기 클래스 회원이 아니면 로또를 구매할수가 없으면 false 반환 하면 좋을거같은데 기본값은 true
		// 자동 수동 고르기
		switch(lotto_way.way(scanner)){
			// 자동인 경우.
			case 1:
				number = lotto_cre.create_lotto(scanner);
				lotto = lotto_cre.auto_lotto(number);
				break;
				
			// 수동인 경우.
			case 2:
				number = lotto_cre.create_lotto(scanner);
				lotto = lotto_cre.choice_lotto(number, scanner);
				break;
				
			default:
				System.out.print("잘못되면 안됨 이미 스위치 선언할때 lotto_choice에서 처리가 다 되어있으므로 default 없어도 무방."); 
		}
		
		// 그냥 확인할려고 만든 코드.
		for(int i = 0 ; i < number; i++) {
			System.out.println((i+1)+"번째 로또 ");
			for(int j = 0 ; j < 6; j++) {
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}
		
	
		
		// 결제 비밀번호
		Lotto_check lotto_chk = new Lotto_check();

        // 비밀번호 확인
        if (lotto_chk.password_check(scanner, number)) {
            int[] nums = new int[6]; // 사용자 로또 번호를 저장할 배열
            for (int i = 0; i < number; i++) {
                nums[i] = scanner.nextInt();
            }

            // 로또 번호 확인
            for (int i = 0; i < number; i++) {
                System.out.println((i + 1) + "번째 로또 번호 확인:");
                Lotto_check.machine_lotto(number);
            }
        }
		// 추첨
		// 등수
		
		
	}
}
