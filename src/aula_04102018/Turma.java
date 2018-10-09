package aula_04102018;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Turma {
	
	//int turma_id;
	//String nomeTurma;
	//String curso;
	Aluno[] alunos = new Aluno[5];
	
	//Scanner entraTurma = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("João",98765,8.3,0);
		Aluno a2 = new Aluno("Pedro",11234,10.0,0);
		Aluno a3 = new Aluno("Paulo",43251,7.5,0);
		Aluno a4 = new Aluno("José",98760,4.0,0);
		Aluno a5 = new Aluno("Gabriel",92385,9.5,3);
		
		Turma t1 = new Turma();
		t1.alunos[0] = a1;
		t1.alunos[1] = a2;
		t1.alunos[2] = a3;
		t1.alunos[3] = a4;
		t1.alunos[4] = a5;
		
		for(int i=0; i<5; i++) {
			System.out.println(toString()
		}
	}
	
}
