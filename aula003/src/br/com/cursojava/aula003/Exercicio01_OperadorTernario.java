package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio01_OperadorTernario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = Integer.parseInt(teclado.nextLine());
		teclado.close();
		String texto = (idade >= 18) ? "Usuario j� pode votar!!" : "Usuario n�o pode votar!!";
		System.out.println(texto);
	}

}
