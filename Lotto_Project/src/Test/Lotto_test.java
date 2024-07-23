package Test; // 최동현 (새로운 클래스가 안 만들어져서 여기다 적음)

import java.util.Scanner; // 최동현 ( 클래스, 예외처리 해야 함. 아직은 기능구현만)
import java.util.Random; // 랜덤 함수

public class Lotto_test {
	String auto;
	
    public int way(Scanner sc){ // main 없애고, Scanner 받아오는 부분 만들기 -> 만들어 놓음(김승현)
    	
    	System.out.println("추첨 방식을 선택하세요 ([1] : 자동 [2] : 수동)");
    	
    	try {
        	int select_lotto = sc.nextInt(); // select_lotto 추첨 방식
    	} catch(NullPointerException e) {
    		System.err.println("에러 : 입력 값이 Null값입니다.");
    	} catch (Exception e) {
    		System.err.println("에러 : 알 수 없는 오류가 발생했습니다.");
    		e.printStackTrace();
    	}
    	
    	if(select_lotto == 1) {
    		
    	}
    	
    	// 여기에는 select_lotto 로또를 입력받을때의 예외처리 부분 들어가야함 .
    	// 그 외는 별거없음 이 클래스는 오직 추첨 방식을 설정하는 클래스.
    	
    	return select_lotto;
    }

}
