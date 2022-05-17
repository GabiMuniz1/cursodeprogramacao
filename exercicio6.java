package curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double A,B,C, triangulo,circulo,trapezio,quadrado,retangulo;
		
		Scanner leia = new Scanner(System.in);
		
		A = leia.nextDouble();
		B = leia.nextDouble();
		C = leia.nextDouble();
		
		triangulo = (A * C)/2;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) * C/2;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("%.3f%n",triangulo);
		System.out.printf("%.3f%n",circulo);
		System.out.printf("%.3f%n",trapezio);
		System.out.printf("%.3f%n",quadrado);
		System.out.printf("%.3f%n",retangulo);
	}

}
