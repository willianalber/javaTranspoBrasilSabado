package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio11_ColocaPalavraCaixaAltaEBaixa {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.nextLine();
		teclado.close();
		
		System.out.println(palavra.toUpperCase()+"\n"+palavra.toLowerCase());
		
	}

}
