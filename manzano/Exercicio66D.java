package manzano;

public class Exercicio66D {
	public static void main(String[] args) {
		int soma = 0;

		for (int contador = 0; contador <= 500; contador++) {
			if (contador % 2 == 0) {
				soma += contador;
			}
		}

		System.out.println("A soma dos números pares de 1 até 500 é: " + soma);
	}
}
