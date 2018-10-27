package br.com.cursojava.aula005.orientacaoobjeto;

public class Contato {

	String nome = "Nome padr�o";
	String email;
	String telefone;
	private static int quantidadeContatos = 0;
	
	public Contato() {
		quantidadeContatos++;
		System.out.println("Quantidade de contatos = "+quantidadeContatos);
	}
	
	void configurarNome(String nome) {
		if (nome != null && nome.length() >= 3)
		{
			this.nome = nome;
		}		
	}
	
	String retornaNome(){
		return nome;
	}

}
