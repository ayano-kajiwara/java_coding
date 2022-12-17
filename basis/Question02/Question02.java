package basis.Question02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		Scanner scanner  = new java.util.Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		
		try {
			int num = Integer.parseInt(s);
			if (num % 2 == 0) {
				System.out.println("入力された　" + num + "　は　偶数です");
			} else if (num % 2 == 1) {
				System.out.println("入力された　" + num + "　は　奇数です");

			}

		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");

		}


	}

}
