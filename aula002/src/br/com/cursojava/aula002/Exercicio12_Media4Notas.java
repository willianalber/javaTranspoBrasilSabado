package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio12_Media4Notas {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		double n1 = Double.parseDouble(leitor.nextLine());
		System.out.println("Digite a nota 2: ");
		double n2 = Double.parseDouble(leitor.nextLine());
		System.out.println("Digite a nota 3: ");
		double n3 = Double.parseDouble(leitor.nextLine());
		System.out.println("Digite a nota 4: ");
		double n4 = Double.parseDouble(leitor.nextLine());
		
		leitor.close();
		
		double media = (n1+n2+n3+n4)/4;
		
		if (media >= 9){
			System.out.println("Conceito A");
		}
		else if (media >= 8){
			System.out.println("Conceito B");
		}
		else if (media >= 6){
			System.out.println("Conceito C");
		}
		else if (media >= 8){
			System.out.println("Conceito D");
		}
		else
			System.out.println("Insulficiente!!");
		
		System.out.println("Média: "+media);
		
	}

}
