package curso_programacao.exercicios;

import java.util.Scanner;

public class modulo6_exercicio2 {

	public static void main(String[] args) {
		
		int x,y;
		Scanner leia = new Scanner (System.in);

		x = leia.nextInt();
		y = leia.nextInt();
		
		while (x != 0 && y !=0 ) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			
			x = leia.nextInt();
			y = leia.nextInt();
		}
	}

}
