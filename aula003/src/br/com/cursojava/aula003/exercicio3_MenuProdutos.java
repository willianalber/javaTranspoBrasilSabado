package br.com.cursojava.aula003;

import java.util.Scanner;

public class exercicio3_MenuProdutos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1- Cadastrar produtos \n2- Listar produtos \n3- Pesquisar produtos \n4- Remover produtos \n5- Sair");
		int opcao = Integer.parseInt(teclado.nextLine());
		teclado.close();
		
		switch (opcao) {
		case 1:
			System.out.println("Voc� escolheu a op��o cadastrar produtos");
			break;
		case 2:
			System.out.println("Voc� escolheu a op��o listar produtos");
			break;
		case 3:
			System.out.println("Voc� escolheu a op��o pesquisar produtos");
			break;
		case 4:
			System.out.println("Voc� escolheu a op��o remover produtos");
			break;
		case 5:
			System.out.println("Obrigado por usar nossos terminanis de atendimento");
			break;

		default:
			System.out.println("Op��o invalida");
			break;
		}
	}

}
