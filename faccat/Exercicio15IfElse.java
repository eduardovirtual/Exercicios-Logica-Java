package faccat;
import java.util.Scanner;

public class Exercicio15IfElse {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Digite um valor: ");
		int numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("Número Negativo");
		}
		else {
			System.out.println("Número Positivo");
		}
		sc.close();
	}

}
