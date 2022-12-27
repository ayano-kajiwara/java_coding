package basis.Question10;

import java.util.Scanner;

public class Question10 {
	// 入力された数に掛ける数
	public static final int MULTIPLE = 2;
	// 入力された数に乗じる数
	public static final int POWER = 2;

	public static void main(String[] args) {
		// try-with-resouce
		try (Scanner scan = new Scanner(System.in);) {
			// メッセージ出力
			System.out.println("整数を入力してください");
			// キーボードから文字列入力
			String inputStr = scan.nextLine();
			// 入力文字列を整数へ変換
			int num = Integer.parseInt(inputStr);
			//引数をnumとして、printCalculateDoubleメソッドを呼び出す
			printCalculateDouble(num);
			//引数をnumとして、printCalculateSquareメソッドを呼び出す
			printCalculateSquare(num);

			// 整数以外の値が入力された場合
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}
	}

	// 引数を2倍にした値を出力する
	public static void printCalculateDouble(int x) {
		int doubleNum = x * MULTIPLE;
		System.out.println("入力された　" + x + "　を" + MULTIPLE + "倍した値は　" + doubleNum + "　です");
	}

	// 引数を2乗にした結果を出力する
	public static void printCalculateSquare(int x) {
		int squareNum = (int) Math.pow(x, POWER);
		System.out.println("入力された　" + x + "　を" + POWER + "乘した値は　" + squareNum + "　です");
	}

}
