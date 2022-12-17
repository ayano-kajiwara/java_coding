package basis.Question05;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// try-with-resouce
		try (Scanner scan = new Scanner(System.in);) {
			int num1 = 100;
			// メッセージ出力
			System.out.println("整数100を入力された値で割り算します");
			System.out.println("割り算する整数を入力してください");
			// キーボードから文字列入力
			String inputStr = scan.nextLine();
			// 入力文字列を整数へ変換
			int num2 = Integer.parseInt(inputStr);
			System.out.println("割り算結果は　" + num1 / num2 + "　です");

		} catch (NumberFormatException e) { // 整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");

		} catch (ArithmeticException e) { // "0"が入力された場合
			System.out.println("0では割り算できません");

		} finally {
			// メッセージ出力
			System.out.println("終了");
		}

	}

}
