package faccat;
import java.util.Scanner;

public class Exercicio54For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Insira um n�mero inteiro N (maior que 0): ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}