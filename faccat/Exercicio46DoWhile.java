package faccat;
import java.util.Scanner;

public class Exercicio46DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;

        do {
            System.out.print("Insira o primeiro valor: ");
            valor1 = scanner.nextInt();

            System.out.print("Insira o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextInt();

            if (valor2 == 0) {
                System.out.println("VALOR INVÁLIDO");
            }
        } while (valor2 == 0);

        double resultado = (double) valor1 / valor2;
        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();
    }
}