package test_for;

import java.util.Scanner;

public class for_test4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while(true) {
			
		System.out.print("숫자: ");
		int nu = s.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= nu; i++) {
			sum += i;
			}
			System.out.printf("1 ~ %d까지의 합은 %d\n", nu, sum);
			System.out.print("계속 하시겠습니까? (y/n): ");
			String end = s2.nextLine();
			if (end.equals("n"))
				break;
		}
		
		s.close();
		s2.close();
	}

}
