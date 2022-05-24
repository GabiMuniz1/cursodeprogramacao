package curso_programacao.exercicios;

import java.util.Scanner;

public class modulo6_exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int x = leia.nextInt();
		
		while(x != 2002) {
			System.out.println("Senha inválida");
			x = leia.nextInt();
		}
			System.out.println("Acesso permitido");
	}

}
