package pegadinhas;

public class StringeSB {

	public static void main(String[] args) {
		String s = "Batatinha";
		String s1 = new String("Chuchu");
		s.replace("Bata", "Haha");
		System.out.println(s);
		s.replace("Bata", "Haha").substring(0, 4).replace("Haha", "Hehehe");
		System.out.println(s);

		// LEFT TO RIGHT
		String s2 = s.replace("Bata", "Haha").substring(0, 4).replace("Haha", "Hehehe");
		System.out.println(s2);

		System.out.println();
		StringBuilder sb = new StringBuilder("Maçã");
		sb.replace(0, 4, "Haha");
		System.out.println(sb);
		sb.append("Lalalalala").replace(4, 8, "Lelele").insert(4, "Bala");
		System.out.println(sb);
	}
}
