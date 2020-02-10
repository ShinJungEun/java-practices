package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		String[] arr = new String[3];
		
		String str = "";
		for(int i = 0; i < COUNT_GOODS; i++) {
			goods[i] = new Goods();
			
			str = scanner.nextLine();
			arr = str.split(" ");
			
			goods[i].setName(arr[0]);
			goods[i].setPrice(Integer.parseInt(arr[1]));
			goods[i].setNum(Integer.parseInt(arr[2]));
			
		}
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			System.out.println(goods[i].getName() + "(가격:" + goods[i].getPrice()
					+ "원)이 " + goods[i].getNum() + "개 입고 되었습니다.");
		}


		scanner.close();
	}
}
