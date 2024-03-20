package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CriadorDeApostas {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		int min = 1;
		int max = 25;

		// Preencha a lista com números de 1 a 25
		for (int i = min; i <= max; i++) {
			numeros.add(i);
		}

		// Divida a lista em conjuntos de 15 números
		int tamanhoConjunto = 15;
		int contador = 0;
		while (contador < 10) {
			// Embaralhe a lista para que os números estejam em ordem aleatória
			Collections.shuffle(numeros);
			List<List<Integer>> conjuntos = new ArrayList<>();

			for (int i = 0; i < numeros.size(); i += tamanhoConjunto) {
				int fim = Math.min(i + tamanhoConjunto, numeros.size());
				List<Integer> conjunto = numeros.subList(i, fim);
				conjuntos.add(conjunto);
			}

			List<Integer> conjunto = conjuntos.get(0);
			Collections.sort(conjunto);
			System.out.println("Conjunto " + (contador) + ": " + conjunto);
			contador++;
		}
	}
}
