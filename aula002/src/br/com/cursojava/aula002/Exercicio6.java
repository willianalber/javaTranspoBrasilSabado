package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua idade em dias: ");
		int idade = Integer.parseInt(teclado.nextLine());
		teclado.close();
		
		int anos = Math.round(idade/360);
		int meses = Math.round((idade - (anos * 360))/30);
		int dias = idade - ((anos * 360)+(meses * 30));
		
		System.out.println(anos+" ano "+meses+" mês "+dias+" dias");
	}

} 