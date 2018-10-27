package br.com.cursojava.aula007.ExercicioAnimal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Cadastro cadastro = new Cadastro();
		cadastro.mostrarMenu(teclado);
		teclado.close();
		
	}

}
