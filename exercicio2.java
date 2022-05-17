package curso_programacao.exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma;
		
		a = leia.nextInt();
		b = leia.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de "+a +" + "+b +" é: "+ soma);
	}

}
