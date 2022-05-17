package curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double r, area, pi = 3.14159;
		
		
		System.out.println("Determine o raio do cículo:");
		r = leia.nextDouble();
		
		area = pi * r * r ;
		
		System.out.printf("Resultado: %.4f",area);
		
	}

}
