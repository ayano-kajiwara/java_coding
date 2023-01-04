package basis.Question12;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// try-with-resouce
		try (Scanner scan = new Scanner(System.in);) {
			// メッセージ出力
			System.out.println("1：氏名を入力する");
			System.out.println("2：氏名を入力しない");
			System.out.print("番号を選択してください（1,2）：");
			// キーボードから文字列入力
			String inputStr = scan.nextLine();
			// 入力文字列を整数へ変換
			int inputNum = Integer.parseInt(inputStr);

			// 氏名が入力された場合
			if (inputNum == 1) {
				// Personインスタンスを生成
				Person p = new Person();
				System.out.println("氏名を入力してください");
				System.out.print("氏名：");
				// キーボードから氏名入力
				String inputName = scan.nextLine();
				// 氏名を設定
				p.setName(inputName);
				// 氏名を出力
				System.out.println("私の名前は　" + p.getName() + "　です");

				// 氏名が入力されない場合
			} else if (inputNum == 2) {
				// Personインスタンスを生成
				Person dummy = new Person();
				// ダミーと出力
				System.out.println("私の名前は　" + dummy.getName() + "　です");

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
