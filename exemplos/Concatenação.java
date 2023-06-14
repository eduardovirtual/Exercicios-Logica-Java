package exemplos;

public class Concatenação {
	public static void main(String[]args) {
		String nome = "Eduardo";
		String sobreNome = "Santos";
		System.out.println(nome + " " + sobreNome);
		System.out.println(nome.concat(" " + sobreNome));
		System.out.println(nome.concat(" ".concat(sobreNome)));
	}

}
