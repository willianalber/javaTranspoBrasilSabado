package br.com.cursojava.aula007.lojinha;

public class FolhaPagamento {
	
	void imprimir(Funcionario funcionario) {
		System.out.println("================== FOLHA PAGAMENTO ===================");
		System.out.printf("Nome: %s \n",funcionario.getNome());
		System.out.printf("Salário base: %.2f \n",funcionario.getSalarioBase());
		System.out.printf("Salário líquido: %.2f \n",funcionario.getSalarioLiquido());
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

	}
	/*
	void imprimir(Vendedor vendedor) {
		System.out.println("================== FOLHA PAGAMENTO ===================");
		System.out.printf("Nome: %s \n",vendedor.getNome());
		System.out.printf("Salário base: %.2f \n",vendedor.getSalarioBase());
		System.out.printf("Salário líquido: %.2f \n",vendedor.getSalarioLiquido());
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

	}*/

}
