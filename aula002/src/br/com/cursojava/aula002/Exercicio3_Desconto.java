package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio3_Desconto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: R$");
		double valorProduto = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Digite o valor do desconto: ");
		double valorDesconto = Double.parseDouble(teclado.nextLine());
		
		teclado.close();
		
		double desconto = valorProduto * (valorDesconto/100);
		double valorLiquido = valorProduto - desconto;
		
		System.out.println("Desconto: R$ "+desconto+"\nTotal liquido: R$ "+valorLiquido);
		

	}

}
