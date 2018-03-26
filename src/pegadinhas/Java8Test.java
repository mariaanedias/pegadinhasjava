package pegadinhas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import pegadinhas.entities.Pessoa;

public class Java8Test {
	public static void main(String[] args) {
		Pessoa p = new Pessoa(10);
		Pessoa p1 = new Pessoa(13);
		Pessoa p2 = new Pessoa(45);
		Pessoa p3 = new Pessoa(89);
		Pessoa p4 = new Pessoa(5);
		Pessoa p5 = new Pessoa(18);
		Pessoa p6 = new Pessoa(16);
		Pessoa p7 = new Pessoa(27);
		Pessoa p8 = new Pessoa(56);
		Pessoa p9 = new Pessoa(1);
		Pessoa p10 = new Pessoa(74);

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.addAll(Arrays.asList(new Pessoa[] { p, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 }));

		filtraPessoas(pessoas, eAdulta());
	}

	public static Predicate<Pessoa> eAdulta() {
		return p -> p.getIdade() > 18;
	}

	public static void filtraPessoas(List<Pessoa> pessoas, Predicate<Pessoa> predicate) {
		pessoas.stream().filter(predicate).collect(Collectors.<Pessoa>toList())
				.forEach(p -> System.out.println(p.getIdade()));
	}
}
