package manzano;

public class Pagina46C {
    public static void main(String[] args) {
        int numero = 1;
        int somatorio = 0;

        while (numero <= 500) {
            if (numero % 2 == 0) { // Verifica se o n�mero � par
                somatorio += numero;
            }
            numero++;
        }

        System.out.println("O somat�rio dos valores pares � de: " + somatorio);
    }
}