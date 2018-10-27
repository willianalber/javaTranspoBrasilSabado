package br.com.cursojava.aula007;

public class Contato {
	private String nome = "Nome padrão";
	private String email;
	private String telefone;
	private boolean novo;
	private static int quantidadeContatos = 0;
	
	public Contato() {
		quantidadeContatos++;
		System.out.println("Quantidade de contatos = "+quantidadeContatos);
	}
	
 	public void setNome(String nome) {
		if (nome != null && nome.length() >= 3)
		{
			this.nome = nome;
		}		
	}
	
	String retornaNome(){
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}
}
