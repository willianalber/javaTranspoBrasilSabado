package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio02_OperadorTernario2_Salario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o salario: R$");
		double salario = Double.parseDouble(teclado.nextLine());
		teclado.close();
		String texto = (salario <= 1800) ? "Usuario insento de imposto de renda!!" : "Usuario não está insento do imposto de renda!!";
		System.out.println(texto);
	}

}
