package manzano;
import java.util.Scanner;

public class Exercicio66B {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        int tabuada;

	        for (int contador = 0; contador <= 10; contador++) {
	            tabuada = numero * contador;
	            System.out.println(numero + " X " + contador + " = " + tabuada);
	        }

	        scanner.close();
	    }
	}