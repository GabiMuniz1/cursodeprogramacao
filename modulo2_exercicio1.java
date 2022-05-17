package curso_programacao.exercicios;

import java.util.Scanner;

public class modulo2_exercicio1 {

	public static void main(String[] args) {
		
		int x = 0;
		Scanner leia = new Scanner(System.in);
		
		x = leia.nextInt();
		
		if(x >= 0) {
			System.out.printf("não é negativo",x);
		}else {
			System.out.printf("é negativo",x);
		}
	}

}
