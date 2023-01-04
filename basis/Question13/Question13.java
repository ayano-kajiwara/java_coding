package basis.Question13;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// try-with-resouce
		try (Scanner scan = new Scanner(System.in);) {
			// メッセージ出力
			System.out.println("1：足し算結果⇒引き算結果の順で出力する");
			System.out.println("2：引き算結果⇒足し算結果の順で出力する");
			System.out.print("番号を選択してください（1,2）：");
			// キーボードから文字列入力
			String inputStr0 = scan.nextLine();
			// 入力文字列を整数へ変換
			int num0 = Integer.parseInt(inputStr0);
			// 1または2が入力された場合
			if ((num0 == 1) || (num0 == 2)) {
				// メッセージ出力
				System.out.println("整数を入力してください");
				System.out.print("1個目：");
				// キーボードから文字列入力
				String inputStr1 = scan.nextLine();
				// 入力文字列を整数へ変換
				int num1 = Integer.parseInt(inputStr1);
				// メッセージ出力
				System.out.print("2個目：");
				// キーボードから文字列入力
				String inputStr2 = scan.nextLine();
				// 入力文字列を整数へ変換
				int num2 = Integer.parseInt(inputStr2);

				// 1：足し算結果⇒引き算結果の順で出力する場合
				if (num0 == 1) {
					// CalculateSuperインスタンスを生成
					CalculateSuper cs = new CalculateSuper(num1, num2);
					// 足し算結果⇒引き算結果の順で出力処理を呼び出し
					cs.flow();

					// 引き算結果⇒足し算結果の順で出力する場合
				} else {
					// CalculateChildインスタンスを生成
					CalculateChild cc = new CalculateChild(num1, num2);
					// 引き算結果⇒足し算結果の順で出力処理を呼び出し
					cc.flow();
				}
				// 1〜2以外が入力された場合
			} else {
				System.out.println("1〜2の範囲で入力してください");
			}

			// 整数以外の値が入力された場合
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}
	}

}
