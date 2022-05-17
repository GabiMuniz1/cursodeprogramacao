package curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {


	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int codigo1,codigo2, quantidade1, quantidade2;
		float preco1, preco2, soma;

		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("Digite o código da peça 1:");
		codigo1 = leia.nextInt();
		
		System.out.println("Digite a quantidade da(s) peça(s) 1:");
		quantidade1 = leia.nextInt();
		
		System.out.println("Digite o preço da peça 1:");
		preco1 = leia.nextFloat();
		
		System.out.println("Digite o código da peça 2:");
		codigo2 = leia.nextInt();
		
		System.out.println("Digite a quantidade da(s) peça(s) 2:");
		quantidade2 = leia.nextInt();
		
		System.out.println("Digite o preço da peça 2:");
		preco2 = leia.nextFloat();
		
		soma = (quantidade1 * preco1 + quantidade2 * preco2);
		
		System.out.printf("O valor total da compra é R$ %.2f", soma);
	}

}
