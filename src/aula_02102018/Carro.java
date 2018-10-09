package aula_02102018;

public class Carro extends Veiculo{
	//int velocidade;
	
	public void acelerar() {
		super.velocidade+=2;
	}

	public Carro(String marca, String placa, String cor, int anoDeFabricacao, int velocidade) {
		super(marca, placa, cor, anoDeFabricacao, velocidade);
		// TODO Auto-generated constructor stub
	}
}
