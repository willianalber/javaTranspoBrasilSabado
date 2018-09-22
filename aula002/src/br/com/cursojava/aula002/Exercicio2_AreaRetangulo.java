package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio2_AreaRetangulo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da base do retangulo: ");
		double base = Double.parseDouble(leitor.nextLine());
		System.out.println("Digite o valor da altura do retangulo: ");
		double altura = Double.parseDouble(leitor.nextLine());
		
		leitor.close();
		
		double area = altura * base;
		double perimetro = altura + base;
		
		System.out.println("Area: "+area+" \nPerimetro: "+perimetro);

	}

}
