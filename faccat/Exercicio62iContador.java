package faccat;
import java.util.Scanner;

public class Exercicio62iContador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira o n�mero de alunos na turma: ");
		int numeroAlunos = scanner.nextInt();

		double somaNotas = 0;

		for (int i = 1; i <= numeroAlunos; i++) {
			System.out.print("Insira a nota do aluno " + i + ": ");
			double nota = scanner.nextDouble();
			somaNotas += nota;
		}

		double media = somaNotas / numeroAlunos;
		System.out.println("A m�dia aritm�tica das notas dos alunos � de: " + media);

		scanner.close();
	}
}
