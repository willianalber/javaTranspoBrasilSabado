package br.com.cursojava.aula005.orientacaoobjeto;

import java.util.Scanner;

public class appContato {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroContato cadastro = new CadastroContato();
		cadastro.mostrarMenu(teclado);
		teclado.close();
		
	}
}
