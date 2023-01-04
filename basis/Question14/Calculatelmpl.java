package basis.Question14;

public class Calculatelmpl implements Calculate {
	//入力された数を掛けた結果を割る数
	static final int DIVISOR = 2;

	// 引数の掛け算結果を返却する
	public int multiplication(int num1, int num2) {
		int maltNum = num1 * num2;
		return maltNum;
	}

	// 引数の掛け算結果を2で割った結果を返却する
	public int division(int num1, int num2) {
		int divNum = (num1 * num2) / DIVISOR;
		return divNum;
	}

}
