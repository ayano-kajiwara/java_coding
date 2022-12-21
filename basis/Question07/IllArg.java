package basis.Question07;

public class IllArg {
	
	public void setNum (int num) {
		if (num <= 0) {
			throw new IllegalArgumentException("整数は０より大きい値を入力してください");
		}
	} 
}
