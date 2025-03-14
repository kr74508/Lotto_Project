package Test;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// 로또 장수 입력의 기능
// 자동, 수동의 입력 기능이 들어간 클래스

public class Lotto_create {

	private int number;

	// 로또 장수를 검사하고 받아오는 함수.
	public int create_lotto(Scanner sc) {
		System.out.print("$몇장의 로또를 구매하시겠습니까? (1장~5장 가능): ");
		try {
			number = sc.nextInt();
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
		System.out.println();
		System.out.print("$$$$$$$$$$" + number + "장을 구매 하셨습니다.!$$$$$$$$$$");
		System.out.println();
		// 분기 테스트
		/*
		if (number < 1 || number > 5) {
			System.out.println("$1장~5장사이의 숫자만 기입해주새요.");
			create_lotto(sc); // 재호출
		} else {
			System.out.println();
			System.out.print("$$$$$$$$$$" + number + "장을 구매 하셨습니다.!$$$$$$$$$$");
			System.out.println();
		}
		*/
		return number;
	}

	// 자동 로또 구매 함수.
	public int[][] auto_lotto(int number) {
		this.number = number;
		int[] lotto = new int[6];
		int[][] total_lotto = new int[number][6];
		
		// int tmp = 0;
		for(int count = 0; count < number; count++) {
			// 무한루프 버그 수정
			/*
			// 랜덤 값 기입.
			for (int i = 0; i < 6; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;
			}
			// 중복값을 다시설정해주는 검사 코드 
			for(int i = 0; i < 6; i++) {
				tmp = lotto[i];
				for(int j=0; j < i; j++) {
					if((i != j ) && tmp == lotto[j]) {
						lotto[i] = (int) (Math.random() * 45) + 1;
						j--;
						continue;
					}
				}
			}
			*/
			Random rand = new Random();
			for (int i = 0; i < 6; i++) {
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
			//중복검사된 배열을 장수에 따라 다른배열로 옮김 
			for(int i = 0; i < 6; i++) {
				total_lotto[count][i] = lotto[i];
			}
		}
		
		return total_lotto;

	}
	
	//수동 로또 구매 함수.
	public int[][] choice_lotto(int number, Scanner sc) {
		
		this.number = number;

	 
			int[] lotto = new int[6];
			int[][] total_lotto = new int[number][6];
			int tmp = 0;
			int count = 0;
			
			 while (count < number) {

	           
	            for (int i = 0; i < 6; i++) {
	                boolean in_num = false;
	                while (!in_num) {
	                    System.out.print((count + 1) + "번째 로또의 " + (i + 1) + " 번째 로또 번호를 입력해주세요 : ");
	                    tmp = sc.nextInt();

	                    // 입력 값이 1 ~ 45 사이인지 체크
	                    if ((tmp < 46) && (tmp > 0)) {
	                        boolean cheak = false;
	                        for (int j = 0; j < i; j++) {
	                            if (lotto[j] == tmp) {
	                            	cheak = true;
	                                break;
	                            }
	                        }
	                        if (!cheak) {
	                            lotto[i] = tmp;
	                            in_num = true;
	                        } 
	                        else 
	                            System.out.println("값이 중복됩니다. 다른 값을 입력해주세요.");
	                        
	                    } 
	                    else 
	                        System.out.println("1 ~ 45 의 값만 입력해주세요.");
	                    
	                }
	            }

	            // 입력된 배열을 전체 로또 배열에 저장
	            for (int i = 0; i < 6; i++) {
	                total_lotto[count][i] = lotto[i];
	            }

	            count++;
	        }
			
			
			
			
		return total_lotto;
	}
}
