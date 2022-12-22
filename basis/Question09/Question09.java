package basis.Question09;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		// try-with-resouce
		try (Scanner scan = new Scanner(System.in);) {
			// メッセージ出力
			System.out.println("5つの整数の数を入力してください");
			// 入力する5つの整数を格納する配列を作成
			int[] data = new int[5];
			// 5つの整数の各値を入力	
			for (int i = 0; i < 5; i++) {
				System.out.print((i + 1) + "個目：");
				// キーボードから文字列入力
				String inputStr = scan.nextLine();
				// 入力文字列を整数へ変換
				data[i] = Integer.parseInt(inputStr);
			}
			// 配列を昇順に並び替える
			for (int j = 0; j < 4; j++) {
				for (int k = 4; j < k; k--) {
					if (data[k] < data[k - 1]) {
						int temp = data[k];
						data[k] = data[k - 1];
						data[k - 1] = temp;
					}
				}
			}

			// 昇順ソート結果をメッセージ出力
			System.out.print("昇順ソート結果は　");
			for (int value : data) {
				System.out.print(value + "　");
			}
			System.out.println("です");

			// 最大値,最小値をメッセージ出力
			int maxNum = data[4];
			int minNum = data[0];
			System.out.println("最大値は　" + maxNum + "　です");
			System.out.println("最小値は　" + minNum + "　です");

		} catch (NumberFormatException e) { // 整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");

		}

	}

}
