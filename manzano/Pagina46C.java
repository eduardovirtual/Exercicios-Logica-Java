package manzano;

public class Pagina46C {
    public static void main(String[] args) {
        int numero = 1;
        int somatorio = 0;

        while (numero <= 500) {
            if (numero % 2 == 0) { // Verifica se o número é par
                somatorio += numero;
            }
            numero++;
        }

        System.out.println("O somatório dos valores pares é de: " + somatorio);
    }
}