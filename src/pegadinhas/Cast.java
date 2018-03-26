package pegadinhas;

import pegadinhas.entities.Estudante;
import pegadinhas.entities.Pessoa;
import pegadinhas.entities.Professor;

public class Cast {
	
	public static void main(String[] args) {
	
		long l = 10;
		double d = 10.35;
		
		l = (long) d;
		System.out.println(l);
		
		d = l;
		System.out.println(d);
		
		Pessoa p = new Estudante();
		Estudante e = null;
		Professor pro = null;
		
		if(p instanceof Estudante) {
			e = (Estudante) p;
			pro = (Professor) p;
		}
	}

}
