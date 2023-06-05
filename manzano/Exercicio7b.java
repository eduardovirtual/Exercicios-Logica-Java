package manzano;
import java.util.Scanner;

public class Exercicio7b {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Informe os graus em Fahrenheit");
		float fahrenheit = sc.nextFloat();
		float celsius = ((fahrenheit - 32)*5)/9;
		System.out.println("O valor de celsius é de: "+ celsius);
		sc.close();
	}

}
