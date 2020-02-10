package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {


	public static void main(String[] args) {

		Random r = new Random();
		Scanner scanner = new Scanner(System.in);

		while(true) {
			int k = r.nextInt(100) + 1;
			int count = 0;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println("1-100");
			
			while(true) {
				count++;
				System.out.print(count + ">>");
				int n = scanner.nextInt();

				if(n > k) {
					System.out.println("더 낮게");
				}
				else if(n < k) {
					System.out.println("더 높게");
				}
				else {
					System.out.println("맞았습니다.");
					break;
				}
			}
			
			System.out.print("다시하시겠습니까(y/n)>>");
			String answer = scanner.next();
			if(answer.equals("n"))
				break;
		}
		scanner.close();
	}
}
