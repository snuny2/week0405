package test_while;

import java.util.Scanner;

public class while_test1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("성명 입력 : ");
			String name = s.nextLine();
			System.out.println(name + "님 환영합니다.");
			System.out.print("계속 하시겠습니까? (y/n) : ");
			String end = s.nextLine();
			if(end.equals("n"))
				break;
		}
		s.close();

	}
}
