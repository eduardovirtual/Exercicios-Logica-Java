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

		System.out.println("A soma de todos os números digitados é: " + soma);
		System.out.println("A média de todos os números digitados é: " + media);
		System.out.println("O total de números digitados é: " + total);

		scanner.close();
	}
}
