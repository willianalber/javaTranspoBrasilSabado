package br.com.cursojava.aula007;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Contato contato = new Contato();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do contato: ");
		contato.setNome(teclado.nextLine());
		//contato.nome = teclado.nextLine();
		//contato.configurarNome(contato.nome);
		contato.setEmail("teste@teste");
		contato.setTelefone("3333333");
		
		
		//System.out.println(contato.nome);
		System.out.println(contato.retornaNome());
		System.out.println(contato.getEmail());
		System.out.println(contato.getTelefone());
		teclado.close();
		

	}


}
