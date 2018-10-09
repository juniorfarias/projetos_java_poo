package aula_04102018;

public class Aluno {
	
	String nome;
	int matricula;
	double media;
	int faltas;
	//int turma_id;
	
	public int addFalta() {
		return this.faltas + 1;
	}

	public Aluno(String nome, int matricula, double media, int faltas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
		this.faltas = faltas;
		//this.turma_id = turma_id;
	}
	
}
