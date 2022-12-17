package basis.Question04;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// メッセージ出力
		System.out.println("2つの同じ文字列を入力してください");
		Scanner scan = new Scanner(System.in);
		// 文字列の入力値判定ループ
		while (true) {
			// １個目のキーボード入力
			System.out.print("1個目：");
			String inputStr1 = scan.nextLine();
			// ２個目のキーボード入力
			System.out.print("2個目：");
			String inputStr2 = scan.nextLine();

			if (inputStr1.isEmpty() || inputStr2.isEmpty()) { // 空白が入力された場合
				System.out.println("空白が入力されています");

			} else if (!(inputStr1.equals(inputStr2))) { // 違う文字が入力された場合
				System.out.println("違う文字列です");

			} else { // 同じ文字が入力された場合
				System.out.println("同じ文字列です");
				break;
			}

		}
		scan.close();

	}
}
