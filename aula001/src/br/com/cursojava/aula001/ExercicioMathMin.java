package br.com.cursojava.aula001;
public class ExercicioMathMin {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 7;
		int n3 = 20;
		int n4 = 30;
		System.out.println("O menor numero é: "+Math.min(Math.min(Math.min(n4,n3),n2),n1));
	}

}
