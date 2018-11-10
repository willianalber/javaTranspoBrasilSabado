package br.com.cursojava.aula008.Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	List<Produto> listaProdutos = new ArrayList<>();
	
	public void mostrarMenu(Scanner teclado){
		System.out.println("1 - Cadastrar produtos");
		System.out.println("2 - listar produtos");
		System.out.println("3 - Remover produtos");	
		verificaOpcao(Integer.parseInt(teclado.nextLine()),teclado);
		
	}
	private void verificaOpcao(int op, Scanner teclado) {
		switch (op) {
		case 1:
			cadastrarProdutos(teclado);
			break;
		case 2:
			listarProdutos(teclado);
		case 3:
			removerProdutos(teclado);

		default:
			opcaoInvalida(teclado);
			break;
		}
		
	}
	private void removerProdutos(Scanner teclado) {
		System.out.println("Digite o indice do produto que deseja remover: ");
		listaProdutos.remove(Integer.parseInt(teclado.nextLine()));
		mostrarMenu(teclado);
	}
	private void listarProdutos(Scanner teclado) {
		
		for (int i = 0; i < listaProdutos.size(); i++) {
			System.out.println(listaProdutos.get(i).getNome());
		}
		mostrarMenu(teclado);
		
	}
	private void cadastrarProdutos(Scanner teclado) {
		Produto produto = new Produto();
		System.out.println("Nome do produto: ");
		produto.setNome(teclado.nextLine());
		System.out.println("Descrição: ");
		produto.setDescricao(teclado.nextLine());
		System.out.println("Preço: ");
		produto.setPreco(Double.parseDouble(teclado.nextLine()));
		listaProdutos.add(produto);
		mostrarMenu(teclado);
		
		
	}
	private void opcaoInvalida(Scanner teclado) {
		System.out.println("Opção invalida! Tente novamente!");
		mostrarMenu(teclado);
		
	}

}
