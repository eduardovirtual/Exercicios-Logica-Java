package manzano;
import java.util.Scanner;

public class Exercicio46F {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor da base: ");
	        int base = scanner.nextInt();

	        System.out.print("Digite o valor do expoente: ");
	        int expoente = scanner.nextInt();

	        int resultado = 1;
	        int contador = 0;

	        while (contador < expoente) {
	            resultado *= base;
	            contador++;
	        }

	        System.out.println(base + "^" + expoente + " = " + resultado);

	        scanner.close();
	    }
	}
