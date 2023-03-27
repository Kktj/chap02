package sec03;

import java.util.Scanner;

public class CompareOperator2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		System.out.printf("영문자와 숫자 또는 한글을 입력하세요.");
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if ('a' <= ch && ch <= 'z') {
			System.out.printf("key- %c 매핑 유니코드는 %d 입니다",ch,(int)ch);
		}
	

	}

}
