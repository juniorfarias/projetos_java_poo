package aula_02102018;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo[] veiculos = new Veiculo[6];
		
		Onibus o1 = new Onibus("Volksvagem", "ABC-1234", "azul", 1993, 55);
		Onibus o2 = new Onibus("Ford", "ABC-4321", "vermelho", 1985, 65);
		Carro c1 = new Carro("BMW", "ABC-6547", "amarelo", 2018, 85);
		Carro c2 = new Carro("Honda", "ABC-3124", "branco", 2014, 70);
		Moto m1 = new Moto("Yamaha", "ABC-9786", "prata", 1999, 90);
		Moto m2 = new Moto("Susuki", "ABC-0945", "preta", 2015, 100);
		
		veiculos[0] = o1;
		veiculos[1] = o2;
		veiculos[2] = c1;
		veiculos[3] = c2;
		veiculos[4] = m1;
		veiculos[5] = m2;
		
		System.out.println(veiculos[0].getVelocidade());
		veiculos[0].acelerar();
		System.out.println(veiculos[0].getVelocidade());
		veiculos[0].frear();
		System.out.println(veiculos[0].getVelocidade());
		
		System.out.println(veiculos[2].getVelocidade());
		veiculos[2].acelerar();
		System.out.println(veiculos[2].getVelocidade());
		veiculos[2].frear();
		System.out.println(veiculos[2].getVelocidade());
		
		System.out.println(veiculos[4].getVelocidade());
		veiculos[4].acelerar();
		System.out.println(veiculos[4].getVelocidade());
		veiculos[4].frear();
		System.out.println(veiculos[4].getVelocidade());
	}

}
