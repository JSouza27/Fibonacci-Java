package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List lista = new ArrayList();

		int currentValue = 1;
		int previousValue = 0;

		lista.add(previousValue);

		while (previousValue < 350){
			lista.add(currentValue);

			currentValue = previousValue + currentValue;
			previousValue = currentValue - previousValue;
		}

		return lista;
	}

	public static Boolean isFibonacci(Integer a) {
		boolean check = fibonacci().contains(a);

		return check;
	}
}