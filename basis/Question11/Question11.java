package basis.Question11;

import java.util.Scanner;

public class Question11 {
	//入力された数を掛けた結果を割る数
	public static final int DIVISOR = 2;

	public static void main(String[] args) {
		// try-with-resouce
		try (Scanner scan = new Scanner(System.in);) {
			// メッセージ出力
			System.out.println("整数を入力してください");
			System.out.println("1個目：");
			// キーボードから文字列入力
			String inputStr1 = scan.nextLine();
			// 入力文字列を整数へ変換
			int num1 = Integer.parseInt(inputStr1);
			// メッセージ出力
			System.out.println("2個目：");
			// キーボードから文字列入力
			String inputStr2 = scan.nextLine();
			// 入力文字列を整数へ変換
			int num2 = Integer.parseInt(inputStr2);
			//引数をnum1,num2として、maltiplicationメソッドを呼び出す
			int maltNum = maltiplication(num1, num2);
			System.out.println(num1 + " と　" + num2 + "　の掛け算結果の値は　" + maltNum + "　です");
			//引数をmaltNum,DIDISIONとして、divisionメソッドを呼び出す
			int divNum = division(maltNum, DIVISOR);
			System.out.println(num1 + "　と　" + num2 + " の掛け算結果を" + DIVISOR + "で割った値は　" + divNum + "　です");

			// 整数以外の値が入力された場合
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}
	}

	// 引数の掛け算結果を返却する
	public static int maltiplication(int x, int y) {
		int maltNum = x * y;
		return maltNum;
	}

	// 引数の掛け算結果を2で割った結果を返却する
	public static int division(int x, int y) {
		int divNum = x / y;
		return divNum;
	}

}
