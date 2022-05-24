package curso_programacao.exercicios;

import java.util.Scanner;

public class modulo6_exercicio4 {
	/*
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
	 * até i, um valor por linha, inclusive o i, se for o caso.
	 */

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int i = leia.nextInt();

		for (int x = 1; x <= i; x ++) {
				if( x % 2 != 0) {
			System.out.println(x);

			}
		}

	}

}
