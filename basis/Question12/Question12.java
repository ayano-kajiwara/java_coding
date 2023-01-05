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

			if (!(inputNum == 1 || inputNum == 2)) { // 1〜2以外が入力された場合
				System.out.println("1〜2の範囲で入力してください");

			} else { // 1か2が入力された場合
				Person p = new Person();

				if (inputNum == 1) { // 1：氏名が入力された場合
					System.out.println("氏名を入力してください");
					System.out.print("氏名：");
					// キーボードから氏名入力
					String inputName = scan.nextLine();
					// 氏名を設定
					p.setName(inputName);
					// 氏名を出力
					System.out.println("私の名前は　" + p.getName() + "　です");

				} else { // 2：氏名が入力されない場合、ダミーと出力
					System.out.println("私の名前は　" + p.getName() + "　です");
				}
			}

			// 整数以外の値が入力された場合
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}
	}

}
