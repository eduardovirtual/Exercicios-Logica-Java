package manzano;
import java.util.Scanner;

public class Exercicio50F {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor = 0;
		double soma = 0;
		int total = 0;
		double media = 0;

		do {
			System.out.print("Digite um valor: ");
			valor = scanner.nextDouble();

			soma += valor;
			total++;
			media = soma / total;
		} while (valor > 0);

		System.out.println("A soma de todos os n�meros digitados �: " + soma);
		System.out.println("A m�dia de todos os n�meros digitados �: " + media);
		System.out.println("O total de n�meros digitados �: " + total);

		scanner.close();
	}
}
