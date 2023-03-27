package sec07;

public class Array13MaxValue {

	public static void main(String[] args) {

		// 1.배열 사용전
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		int num = 0; // 임시 보관 변수
		if (num < a)
			num = a;
		if (num < b)
			num = b;
		if (num < c)
			num = c;
		if (num < d)
			num = d;
		if (num < e)
			num = e;
		System.out.println("제일 큰 수는 : " + num);
		
		
		num = 0;
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for (int ar : arr) {
			if (ar > num) {
				num = ar;
			}
			System.out.println("향상된 for문 제일 큰 수는 : " + num);
		}
		for (int i = 0; i < args.length; i++) {
			if (arr[i] > num) {
				num = arr[i];
			}
			System.out.println("제일 큰 수는[배열사용] : " + num);
			
		}

	}

}
