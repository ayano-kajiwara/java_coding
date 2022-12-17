package basis.Question06;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// try-with-resouce
		try (Scanner scan = new Scanner(System.in);) {
			// メッセージ出力
			System.out.println("本日の曜日番号を入力してください");
			// キーボードから文字列入力
			String inputStr = scan.nextLine();
			// 入力文字列を整数へ変換
			int day = Integer.parseInt(inputStr);
			// 条件分岐
			switch (day) {
			// 0〜6の整数が入力された場合
			case 0:
				System.out.println("本日は　日曜日　です");
				break;
			case 1:
				System.out.println("本日は　月曜日　です");
				break;
			case 2:
				System.out.println("本日は　火曜日　です");
				break;
			case 3:
				System.out.println("本日は　水曜日　です");
				break;
			case 4:
				System.out.println("本日は　木曜日　です");
				break;
			case 5:
				System.out.println("本日は　金曜日　です");
				break;
			case 6:
				System.out.println("本日は　土曜日　です");
				break;
			// 0〜6以外の整数が入力された場合
			default:
				System.out.println("0〜6の範囲で入力してください");
			}

		} catch (NumberFormatException e) { // 整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");

		}
	}

}
