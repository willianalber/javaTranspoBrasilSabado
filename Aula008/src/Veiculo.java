
public class Veiculo {
	private Integer id;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int anoModelo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao
				+ ", anoModelo=" + anoModelo + "]";
	}
	
	public boolean equals(Object objeto){
		if (objeto instanceof Veiculo){
			Veiculo v = (Veiculo) objeto;
			if (id != null && v.id != null){
				return id.equals(v.id);
			}else if (id == null && v.id == null){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	public int hashCode(){
		int base = 17;
		int numero = id != null ? id.hashCode() : 1;
		return base+numero;
	}

}
