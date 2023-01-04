package basis.Question14;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// try-with-resouce
		try (Scanner scan = new Scanner(System.in);) {
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
			// Calculatetelmplインスタンスを生成
			Calculatelmpl c = new Calculatelmpl();
			// 掛け算結果を出力
			System.out.println(num1 + " と　" + num2 + "　の掛け算結果の値は　" + c.multiplication(num1, num2) + "　です");
			// 掛け算結果を2で割った数を出力
			System.out.println(num1 + "　と　" + num2 + " の掛け算結果を" + Calculatelmpl.DIVISOR + "で割った値は　"
					+ c.division(num1, num2) + "　です");

			// 整数以外の値が入力された場合
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}
	}

}
