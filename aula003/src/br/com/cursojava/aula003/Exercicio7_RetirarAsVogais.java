package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio7_RetirarAsVogais {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = teclado.nextLine();
		teclado.close();
		
		System.out.println(frase.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", ""));
	}

}
