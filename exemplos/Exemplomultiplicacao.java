package exemplos;
import java.util.Scanner;

public class Exemplomultiplicacao {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero01=sc.nextInt();
		System.out.println("Digite outro n�mero: ");
		int numero02=sc.nextInt();
		int multiplicacao=numero01*numero02;
		System.out.println("O resultado ser�: "+multiplicacao);
		sc.close();	
	}

}
