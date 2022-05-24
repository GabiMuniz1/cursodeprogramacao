package curso_programacao.exercicios;

import java.util.Scanner;

public class modulo6_exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int combustivel = 0;
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;

		combustivel = leia.nextInt();

		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool = alcool + 1;
			}
			else if(combustivel == 2) {
				gasolina = gasolina +1;
			}
			else if (combustivel == 3) {
				disel = disel + 1;
			}
			else if (combustivel > 4) {
				System.out.println("Informe um valor válido (1 até 4)");
			}
			combustivel = leia.nextInt();
		}	
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Disel: "+ disel);
	}
}
