package basis.Question08;

import java.util.ArrayList;
import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		// try-with-resouce
		try (Scanner scan = new Scanner(System.in);) {
			// メッセージ出力
			System.out.println("整数の数を入力してください");
			// キーボードから文字列入力
			String inputStr1 = scan.nextLine();
			// 入力文字列を整数へ変換
			int num = Integer.parseInt(inputStr1);

			if (num <= 0) { // 整数の数が0以下だった場合
				System.out.println("整数は0より大きい値を入力してください");

			} else {
				// 入力する複数の整数を格納するArrayListを作成
				ArrayList<Integer> numsList = new ArrayList<Integer>();
				// ※1で使用する整数の合計を初期化する
				int sum = 0;
				// 複数の整数の各値を入力	
				for (int i = 0; i < num; i++) {
					System.out.print((i + 1) + "個目：");
					String inputStr2 = scan.nextLine();
					int data = Integer.parseInt(inputStr2);
					numsList.add(data);
					sum += data; // ※1で使用する整数の合計
				}

				// 入力された値をメッセージ出力
				System.out.print("入力された値は　");
				for (int value : numsList) {
					System.out.print(value + "　");
				}
				System.out.println("です");

				int avg = sum / numsList.size(); // ※1
				System.out.println("入力された整数の平均は　" + avg + "　です");
			}

		} catch (NumberFormatException e) { // 整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");

		}

	}

}
