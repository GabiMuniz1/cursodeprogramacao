package curso_programacao.exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		int A,B,C,D,diferenca;
		
		System.out.println("Escreva o Valor de A:");
		A = leia.nextInt();
		System.out.println("Escreva o Valor de B:");
		B = leia.nextInt();
		System.out.println("Escreva o Valor de C:");
		C = leia.nextInt();
		System.out.println("Escreva o Valor de D:");
		D = leia.nextInt();
		
		diferenca = (A*B - C*D);
		
		System.out.println(diferenca);
	}

}
