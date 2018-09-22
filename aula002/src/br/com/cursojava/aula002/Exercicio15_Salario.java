package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio15_Salario {
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o salario: ");
		double salario = Double.parseDouble(teclado.nextLine());
		
		teclado.close();
		
		double inss = salario * 0.11;
		double ipr = 0;
		
		if ((salario - inss > 1800) && (salario - inss <= 2400)){
			ipr = (salario - inss)* 0.075;			
		}
		else if ((salario - inss > 2400) && (salario - inss <= 3600)){
			ipr = (salario - inss)* 0.24;			
		}
		else if (salario - inss > 3600){
			ipr = (salario - inss)* 0.32;			
		}
		
		System.out.println("Salario Bruto R$ "+salario+"\nINSS: R$ "+inss+"\nIPRF: R$ "+ipr+"\nSalario Liquido: R$ "+(salario-ipr-inss) );
	}

}
