package basis.Question03;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		Scanner scanner = new java.util.Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();

		try {
			int num = Integer.parseInt(s);
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if (i == j) {
						System.out.print("＊");
					} else {
						System.out.print("・");
					}
				}
				System.out.println("");

			}

		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");

		}

	}

}
