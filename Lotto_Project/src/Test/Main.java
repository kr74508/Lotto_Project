package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Lotto_join join = new Lotto_join(scanner); // 회원가입
		
		
		
		
		Lotto_create lotto_cre = new Lotto_create();
		lotto_cre.create_lotto(scanner);
		lotto_cre.auto_lotto();
		

	}
}
