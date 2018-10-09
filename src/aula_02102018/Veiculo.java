package aula_02102018;

public class Veiculo {
	
	String marca;
	String placa;
	String cor;
	int anoDeFabricacao;
	int velocidade;
	
	public Veiculo(String marca, String placa, String cor, int anoDeFabricacao, int velocidade) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.cor = cor;
		this.anoDeFabricacao = anoDeFabricacao;
		this.velocidade = velocidade;
	}

	public void frear() {
		this.velocidade-=1;
	}
	
	public void acelerar() {
		this.velocidade+=1;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setAnoDeFabricacao(int ano) {
		this.anoDeFabricacao = ano;
	}
	
	public void  setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public int getAnoDeFabricacao() {
		return this.anoDeFabricacao;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public String getCor() {
		return this.cor;
	}
	
}
