package exemplos;

public class MathJava {
	public static void main(String[]args) {
		Math.max(5,9);
		System.out.println(Math.max(5,9)); //Compara e mostra o maior valor
		
		Math.min(5,9);
		System.out.println(Math.min(5,9)); //Compara e mostra o menor valor
		
		double x = Math.sqrt(64); //Mostra a raíz quadrada do valor
		int y = (int) x;
		System.out.println(y);
		
		System.out.println(Math.abs(-3.9)); //Transforma um valor em absoluto (logo, e positivo)
		
		int random = (int)(Math.random() * 101);
		System.out.println(random); //Faz com que sejam valores de 0 a 100 de forma aleatória
	}

}
