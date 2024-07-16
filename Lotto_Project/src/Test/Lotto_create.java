package Test;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class Lotto_create {

	private int number;

	// 로또 장수를 검사하고 받아오는 함수.
	public int create_lotto(Scanner sc) {
		System.out.print("$몇장의 로또를 구매하시겠습니까? (1장~5장 가능): ");
		try {
			this.number = sc.nextInt();
			if (number < 1 || number > 5) {
				System.out.println("$1장~5장사이의 숫자만 기입해주새요.");
				create_lotto(sc); // 재호출
			} else {
				System.out.println();
				System.out.print("$$$$$$$$$$" + number + "장을 구매 하셨습니다.!$$$$$$$$$$");
				System.out.println();
				return number;
			}
		} catch (NullPointerException e) {
			System.out.println();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("$$$$$$$ > 정확한 값을 입력해주세요 < $$$$$$$");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			sc.next(); // 입력 스트림에 남아 있는 잘못된 데이터를 제거 (이거 안하면 무한에러 가능성있음.)
			create_lotto(sc);
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("$$$$$$$ > 정확한 값을 입력해주세요 < $$$$$$$");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			sc.next();
			create_lotto(sc);
		} catch (Exception e) {
			System.out.println("$알 수 없는 이유로 에러.");
			sc.next();
			create_lotto(sc);
		}
		return 0;
	}

	// 자동으로 로또 번호 만들어주는 함수.
	public int[][] auto_lotto(int number) {
		 this.number = number;


		int[] lotto = new int[6];
		int[][] total_lotto = new int[number][6];
		int tmp = 0;
		int count = 0;
		while(count < number) {
		
		// 랜덤 값 기입.
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}
		
		// 중복값을 다시설정해주는 검사 코드 
		for(int i = 0; i < 6; i++) {
			tmp = lotto[i];
			for(int j=0; j <= i; j++) {
				if((i != j ) && tmp == lotto[j]) {
					lotto[i] = (int) (Math.random() * 45) + 1;
					j--;
					continue;
				}
			}
		}
		//중복검사된 배열을 장수에 따라 다른배열로 옮김 
		for(int i = 0; i < 6; i++) {
			total_lotto[count][i] = lotto[i];
		}
		
		count++;
		}
		return total_lotto;

	}
		//수동 로또 구매 
		public int[][] choice_lotto(int number, Scanner sc) {
			
			 	this.number = number;

			 	
				int[] lotto = new int[6];
				int[][] total_lotto = new int[number][6];
				int tmp = 0;
				int count = 0;
				while(count < number) {
				
				// 랜덤 값 기입.
				for (int i = 0; i < 6; i++) {
					System.out.println((count+1)+"로또의"+(i+1)+"번째 로또 번호를 입력해주세요 : ");
					lotto[i] = sc.n
				}
				
				// 중복값을 다시설정해주는 검사 코드 
				for(int i = 0; i < 6; i++) {
					tmp = lotto[i];
					for(int j=0; j <= i; j++) {
						if((i != j ) && tmp == lotto[j]) {
							lotto[i] = (int) (Math.random() * 45) + 1;
							j--;
							continue;
						}
					}
				}
				//중복검사된 배열을 장수에 따라 다른배열로 옮김 
				for(int i = 0; i < 6; i++) {
					total_lotto[count][i] = lotto[i];
				}
				
				count++;
				}
			
			return total_lotto;
		}
		
	
}
