package pegadinhas;

public class CompararStrings {
	public static void main(String[] args) {

		System.out.println("\nUsando Igual:");
		usandoIgual();
		System.out.println("\nUsando Equals:");
		usandoEquals();
		
		char[] name = new char[] { 'P', 'a', 'u', 'l' };
		String boy = new String(name); // String constructor can accept a char array
		System.out.println("\nName: "+boy);

	}

	private static void usandoIgual() {
		String s1 = new String("Mary");
		String s2 = new String("Mary");
		System.out.println("s1(new) == s2(new): " + (s1 == s2));

		// String Pool
		String s3 = "Mary";
		String s4 = "Mary";
		System.out.println("s3(pool) == s4(pool): " + (s3 == s4));

		System.out.println("s3(pool) == s1(new): " + (s3 == s1)); // Objeto x Pool

		s1 = "Mary";
		System.out.println("s1(pool) == s3(pool): " + (s3 == s1)); // Pool

		s1 = s2; // Igualando referência de memória
		System.out.println("s1 = s2: " + (s1 == s2));

		String morning1 = "Morning";
		System.out.println("morning1(pool) == Morning(pool): " + ("Morning" == morning1));

		String morning2 = new String("Morning");
		System.out.println("morning2(new) == Morning(pool): " + ("Morning" == morning2));
		// String objects are immutable so the pool can be called string constant pool
	}

	private static void usandoEquals() {
		String s1 = new String("Mary");
		String s2 = new String("Mary");
		System.out.println("s1(new) equals s2(new): " + s1.equals(s2));

		// String Pool
		String s3 = "Mary";
		String s4 = "Mary";
		System.out.println("s3(pool) == s4(pool): " + s3.equals(s4));

		System.out.println("s3(pool) == s1(new): " + s3.equals(s1)); // Objeto x Pool

		s1 = "Mary";
		System.out.println("s1(pool) == s3(pool): " + s3.equals(s1)); // Pool

		s1 = s2; // Igualando referência de memória
		System.out.println("s1 = s2: " + (s1 == s2));

		String morning1 = "Morning";
		System.out.println("morning1(pool) == Morning(pool): " + "Morning".equals(morning1));

		String morning2 = new String("Morning");
		System.out.println("morning2(new) == Morning(pool): " + "Morning".equals(morning2));
		// String objects are immutable so the pool can be called string constant pool
	}
}
