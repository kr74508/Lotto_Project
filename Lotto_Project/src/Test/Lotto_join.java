package Test;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lotto_join {
	private Scanner sc;

	public Lotto_join(Scanner sc_join) {
		this.sc = sc_join;
		startSignUp();
	}
  
	private void startSignUp() { //회원가입 진행
		System.out.println("[INFO] 안녕하세요. 동행로또입니다.");
		System.out.println("로또 구입을 위해선 회원가입이 필요합니다.");
		System.out.println("회원가입을 진행하시겠습니까?");
		System.out.println("[1] 예\t[2] 아니요");
		// try 시작
		for (int i = 0; i < 1; i++) {
			System.out.print("\n입력 : ");
			String answer = sc.next();

			if (answer.equals("1") || answer.equals("예")) {
				SignUp();
				break;
			} else if (answer.equals("2") || answer.equals("아니요")) {
				System.out.println("\n[에러] 회원이 아니면 로또를 구매할 수 없습니다.");
				System.exit(0); // return; 으로 변경
			} else {
				System.out.println("\n[에러] 잘못된 입력입니다. 다시 입력해주세요.");
			}

		}
		// try 종료 catch 시작
	}

	private void SignUp() { // 정보입력
		System.out.println("[INFO] 회원가입을 위해 아래 양식을 채워주세요\n");

		System.out.print("이름 : ");
		String name = sc.next(); // 이름
		// 입력된 이름 저장
		// setName(name);
		
		// 생년월일
		int year = 0;
		while (true) {
			System.out.print("태어난 연도: ");
			try {
				year = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("[에러] 잘못된 입력입니다. 숫자로 입력해주세요");
				sc.next(); // 무한루프 방지
			}
		}
		int month = 0;
		while (true) {
			System.out.print("태어난 월 :");
			try {
				month = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("[에러] 잘못된 입력입니다. 숫자로 입력해주세요");
				sc.next(); // 무한루프 방지
			}
		}
		int day = 0;
		while (true) {
			System.out.print("태어난 일 :");
			try {
				day = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("[에러] 잘못된 입력입니다. 숫자로 입력해주세요");
				sc.next(); // 무한루프 방지
			}
		}

		if (!isAdult(year, month, day)) {
			System.out.println("[에러] 미성년자는 로또를 구매할 수 없습니다.");
			return;
		}

		System.out.print("주소 : "); // 주소
		String address = sc.next();

		System.out.print("비밀번호 : "); // 비밀번호
		String pwd = sc.next();

		System.out.println("[INFO] 회원가입이 완료 되었습니다.");
	}

	// 캘린더로 미셩년자 체크 *
	private boolean isAdult(int year, int month, int day) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();
		// 성인 구분 경계 확실하게 check
		birthDate.set(year, month - 1, day); // 월은 0부터 시작하므로 -1

		int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
		if (today.get(Calendar.MONTH) < birthDate.get(Calendar.MONTH)
				|| (today.get(Calendar.MONTH) == birthDate.get(Calendar.MONTH)
						&& today.get(Calendar.DAY_OF_MONTH) < birthDate.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}
		return age >= 19;
	}
}
