package faccat;
import java.util.Scanner;

public class Exercicio61iContador {
    public static void main(String[] args) {
        int quantidadeValores = 10;
        double soma = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / quantidadeValores;
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}
