package br.com.cursojava.aula007.Exercicio;

public class testes {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Carro();
		Aviao av = new Aviao();
		Veiculo v3 = av;
		
		if (v3 instanceof Aviao) {
			((Aviao) v3).voar();
		}

	}

}
