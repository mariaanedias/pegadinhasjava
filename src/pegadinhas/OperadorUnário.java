package pegadinhas;

public class OperadorUnário {

	public static void main(String[] args) {
		int i = 0;
		int val = i++ + ++i + ++i + i++ + i++ + i;
		System.out.println(val);

	}
}
