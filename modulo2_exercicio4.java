package curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class modulo2_exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double valor;

		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha um valor");
		valor = leia.nextDouble();
		if (valor < 0.0 || valor > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (valor <= 25.0) {
			System.out.println("Intervalo (0,25)");
		} else if (valor <= 50.0) {
			System.out.println("Intervalo (25,50)");
		} else if (valor <= 75.0) {
			System.out.println("Intervalo (50,75)");
		} else {
			System.out.println("Intervalo (75,100)");
		}
	}
}
