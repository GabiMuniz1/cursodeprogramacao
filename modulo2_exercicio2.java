package curso_programacao.exercicios;

import java.util.Scanner;

public class modulo2_exercicio2 {

	public static void main(String[] args) {

		int x;
		Scanner leia = new Scanner (System.in);
		
		x = leia.nextInt();
		
		if(x % 2 == 0) {
		System.out.printf("%d é par",x);
		}else {
			System.out.printf("%d é impar",x);
		}
	} 

}
