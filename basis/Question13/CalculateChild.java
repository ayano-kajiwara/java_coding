package basis.Question13;

public class CalculateChild extends CalculateSuper {

	// コンストラクタ
	public CalculateChild(int num1, int num2) {
		super(num1, num2);
	}

	// 引き算結果⇒足し算結果の順で出力処理を呼び出し
	public void flow() {
		super.subtraction();
		super.sum();
	}

}
