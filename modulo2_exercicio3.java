package curso_programacao.exercicios;

import java.util.Scanner;

public class modulo2_exercicio3 {

	public static void main(String[] args) {
		
		int A,B;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o Valor de A:");
		A = leia.nextInt();
		System.out.print("Digite o Valor de B:");
		B = leia.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
	}

}
