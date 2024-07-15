package Test; // 최동현 (새로운 클래스가 안 만들어져서 여기다 적음)

import java.util.Scanner; // 최동현 ( 클래스, 예외처리 해야 함. 아직은 기능구현만)
import java.util.Random; // 랜덤 함수

public class Lotto_test {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Random rand = new Random(); // 랜덤 객체 생성
    	
    	System.out.println("구매할 장수를 입력하세요");
    	int buy_number = sc.nextInt(); // number = 구매 수량
    	int [] lotto_arr = new int[buy_number]; // 로또 번호를 저장할 배열 선언
    	
    	System.out.println("추첨 방식을 선택하세요 (1 : 자동, 2 : 수동)");
    	int select_lotto = sc.nextInt(); // select_lotto 추첨 방식
    	
    	    	if (select_lotto == 1) { // 자동 선택
    	    		for ( int i = 0; i < buy_number; i++ ) {

    	    		lotto_arr[i] = rand.nextInt(45);
    	    		} 
    	    	}
    	    	else if (select_lotto == 2) { // 수동 선택
    	    		for ( int i = 0; i < buy_number; i++ ) {
    	    			int input_number = sc.nextInt(); // input_number = 수동번호 입력
    	    			lotto_arr[i] = input_number;
    	    		}
    	    	}
    	    	
    	    	for(int j = 0; j < buy_number; j++) {
    	    		System.out.println(lotto_arr[j]);
    	    	}
    	
    	
    	System.out.println("update");	
			
	
	
    }

}
