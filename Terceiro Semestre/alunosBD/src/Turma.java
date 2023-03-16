package src;

public class Turma{
//adicionar aluno em turma
	public Aluno[] aluno = new Aluno[30];
	public void adicionarAluno(Aluno novoAluno){
		int posicao = 0;
		Aluno iterador = aluno[posicao];
		while(iterador != null){
			posicao++;
			iterador = aluno[posicao];
		}
		aluno[posicao] = novoAluno;
	}
//consultar aluno em turma por matricula

//consultar aluno em turma por nome 
	
}