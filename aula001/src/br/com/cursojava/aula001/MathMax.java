package br.com.cursojava.aula001;

public class MathMax {

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 7;
		int n3 = 25;
		int n4 = 10;
		System.out.println("O maior numero é: "+Math.max(Math.max(Math.max(n4,n3),n2),n1));

	}

}
