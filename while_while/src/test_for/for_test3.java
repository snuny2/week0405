package test_for;

public class for_test3 {

	public static void main(String[] args) {
		for (int i = 2; i > 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j * i);
			}
			System.out.print("\n");
		}

	}

}
