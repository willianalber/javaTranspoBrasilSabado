package br.com.cursojava.aula005.orientacaoobjeto;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do contato: ");
		contato.configurarNome(teclado.nextLine());
		//contato.nome = teclado.nextLine();
		//contato.configurarNome(contato.nome);
		contato.email = "teste@teste";
		contato.telefone = "3333333";
		
		
		//System.out.println(contato.nome);
		System.out.println(contato.retornaNome());
		System.out.println(contato.email);
		System.out.println(contato.telefone);
		teclado.close();
		

	}

}
