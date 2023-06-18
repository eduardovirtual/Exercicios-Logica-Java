package manzano;

public class Exercicio50D {
    public static void main(String[] args) {
        int quadro = 1;
        double graos = 1.0;
        double somatorio = 1.0;
        while (quadro < 64) {
            graos *= 2.0;
            somatorio += graos;
            quadro++;
        }
        System.out.println("O somatório de grãos de trigo é: " + somatorio);
    }
}