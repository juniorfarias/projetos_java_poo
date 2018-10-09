package aula_02102018;

public class Onibus extends Veiculo{
	//int velocidade;
	
	public void frear() {
		super.velocidade-=2;
	}

	public Onibus(String marca, String placa, String cor, int anoDeFabricacao, int velocidade) {
		super(marca, placa, cor, anoDeFabricacao, velocidade);
		// TODO Auto-generated constructor stub
	}
}
