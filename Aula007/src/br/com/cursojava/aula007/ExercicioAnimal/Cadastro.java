package br.com.cursojava.aula007.ExercicioAnimal;

import java.util.Scanner;

public class Cadastro {
	
	controleCadastro controle = new controleCadastro();
	
	public void mostrarMenu(Scanner teclado) {
		System.out.println("###### MENU PRINCIPAL ######");
		int opcao = 0;
		do {
			System.out.println("1 - Cadastrar cachorro");
			System.out.println("2 - Cadastrar gato");
			System.out.println("3 - Listar animais");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != 3);

	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarCachorro(teclado);
			break;
		case 2:
			cadastrarGato(teclado);
		case 3:
			listarAnimais();

		default:
			break;
		}
		
	}

	private void listarAnimais() {
		// TODO Auto-generated method stub
		
	}

	private void cadastrarGato(Scanner teclado) {
		Gato gato = new Gato();
		System.out.println("Digite o nome: ");
		gato.setNome(teclado.nextLine());
		System.out.println("Digite a idade");
		gato.setIdade(Integer.parseInt(teclado.nextLine()));
		controle.cadastrarAnimal(gato);	
		
	}

	private void cadastrarCachorro(Scanner teclado) {
		Cachorro cachorro = new Cachorro();
		System.out.println("Digite o nome: ");
		cachorro.setNome(teclado.nextLine());
		System.out.println("Digite a idade");
		cachorro.setIdade(Integer.parseInt(teclado.nextLine()));
		controle.cadastrarAnimal(cachorro);	
	}

}
