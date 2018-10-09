package aula_02102018;

public class Moto extends Veiculo{	
	//int velocidade;
	
	public void acelerar() {
		super.velocidade+=3;
	}

	public Moto(String marca, String placa, String cor, int anoDeFabricacao, int velocidade) {
		super(marca, placa, cor, anoDeFabricacao, velocidade);
		// TODO Auto-generated constructor stub
	}
}
