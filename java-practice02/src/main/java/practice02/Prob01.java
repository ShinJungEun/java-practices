package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		Scanner scanner = new Scanner(System.in);

		System.out.print("금액:");

		int n = scanner.nextInt();

		int tmp = n;
		int r = n;
		int count = 0;
		for(int i = 0; i < MONEYS.length; i++) {
			count = 0;
			tmp = r;

			while(tmp >= MONEYS[i]) {
				tmp -= MONEYS[i];
				count++;
			}

			System.out.println(MONEYS[i] + "원 : " + count + "개");

			r -= (MONEYS[i] * count);
		}

		scanner.close();
	}

}
