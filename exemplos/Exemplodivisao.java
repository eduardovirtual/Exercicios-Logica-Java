package exemplos;
import java.util.Scanner;

public class Exemplodivisao {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		float numero01=sc.nextFloat();
		System.out.println("Digite outro n�mero: ");
		float numero02=sc.nextFloat();
		float divisao=numero01/numero02;
		System.out.println("O resultado ser�: "+divisao);
		sc.close();
	}

}
