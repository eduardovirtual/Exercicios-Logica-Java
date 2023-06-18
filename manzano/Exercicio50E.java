package manzano;
import java.util.Scanner;

public class Exercicio50E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int numero = 1;
        int valor = 0;
        long fatorial = 1;
        long soma = 0;

        do {
            System.out.print("Digite um valor: ");
            valor = scanner.nextInt();

            numero = 1;
            fatorial = 1;

            do {
                fatorial *= numero;
                numero++;
            } while (numero <= valor);

            System.out.println("Fatorial do valor digitado: " + fatorial);
            soma += fatorial;
            contador++;
        } while (contador <= 15);

        System.out.println("O somatório das fatoriais é: " + soma);

        scanner.close();
    }
}
