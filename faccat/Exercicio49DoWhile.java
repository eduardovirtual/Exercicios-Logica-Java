package faccat;
import java.util.Scanner;

public class Exercicio49DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota1, nota2;
		char resposta;

		do {
			do {
				System.out.print("Digite a nota da 1� avalia��o (0 a 10): ");
				nota1 = scanner.nextDouble();
			} while (nota1 < 0 || nota1 > 10);

			do {
				System.out.print("Digite a nota da 2� avalia��o (0 a 10): ");
				nota2 = scanner.nextDouble();
			} while (nota2 < 0 || nota2 > 10);

			double media = (nota1 + nota2) / 2;
			System.out.println("A m�dia do aluno �: " + media);

			System.out.print("NOVO C�LCULO (S/N)? ");
			resposta = scanner.next().charAt(0);
		} while (resposta == 'S' || resposta == 's');

		scanner.close();
	}
}