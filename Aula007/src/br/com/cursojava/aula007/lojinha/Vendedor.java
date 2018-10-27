package br.com.cursojava.aula007.lojinha;

public class Vendedor extends Funcionario {
	
	private double porcentualComissao;
	private double totalVendasMes;

	public double getPorcentualComissao() {
		return porcentualComissao;
	}
	public void setPorcentualComissao(double porcentualComissao) {
		if (porcentualComissao > 1){
			porcentualComissao /= 100;
		}
		if (porcentualComissao >= 0){
			this.porcentualComissao = porcentualComissao;
		}
		
	}
	public double getTotalVendasMes() {
		return totalVendasMes;
	}
	public void setTotalVendasMes(double totalVendasMes) {
		this.totalVendasMes = totalVendasMes;
	}
	
	@Override
	public double getSalarioLiquido() {
		double comissao = totalVendasMes * porcentualComissao;
		double salarioBruto = this.getSalarioBase() + comissao;
		return salarioBruto * (1 - 0.11);
	}


	

}
