package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Lotto_join join = new Lotto_join(scanner); // 회원가입
		
		
		
		
		Lotto_create lotto_cre = new Lotto_create();
		
		// 자동 수동 고르기
		
		// 자동인 경우		
		int[][] lotto = lotto_cre.auto_lotto(lotto_cre.create_lotto(scanner));

		// 수동인 경우
		
		// 결제 비밀번호
		
		// 추첨
		
		// 등수
		
		
	}
}
