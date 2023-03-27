package sec04;

import java.util.Scanner;

public class TestExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		int a = scanner.nextInt();
		System.out.println("두 번째 숫자를 입력하세요 : ");
		int b = scanner.nextInt();
		
		
		if (a > b) {
			System.out.println("첫 번째 숫자가 큽니다.");
		}else {
			System.out.println("두 번쨰 숫자가 큽니다.");
		}
		// 자원 닫기
		scanner.close();

	}

}
