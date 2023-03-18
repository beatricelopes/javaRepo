package src;

import java.awt.dnd.DropTarget;

public class Turma{
//adicionar aluno em turma
	public Aluno[] alunos = new Aluno[30];
	public boolean adicionarAluno(Aluno novoAluno){
		int posicao = 0;
		Aluno i = alunos[posicao];
		while(i != null){
			posicao++;
			i = alunos[posicao];
		}
		//usando o metodo validarMatricula para setar a posicao do aluno
		if (validarMatricula(novoAluno.getMatricula()) == true) {
			alunos[posicao] = novoAluno;
			alunos[posicao].setPosicao(posicao);
			return true;
		}
		return false;

	}
//consultar aluno em turma por matricula
	public Aluno buscarMatricula(String matricula) {
		for (int i=0; i<alunos.length; i++) {
			if (alunos[i].getMatricula() == matricula) {
				return alunos[i];
			}
		}
		return null;
	}
	
//consultar aluno em turma por nome 
	public Aluno buscarNome(String nome) {
		for (int i=0; i<alunos.length; i++) {
			if (alunos[i].getNome() == nome) {
				return alunos[i];
			}
		}
		return null;
	}
	
//imprimir lista de alunos
	public void imprimirAluno(){
		for(int i=0; i<alunos.length; i++) {
			System.out.println(alunos[i].getNome());
			System.out.println(alunos[i].getCurso());
			System.out.println(alunos[i].getMatricula());
			System.out.println(alunos[i].getNotaP1());
			System.out.println(alunos[i].getNotaP2());
			System.out.println(alunos[i].getNotaP3());
			System.out.println(alunos[i].getNotaP4());
		}
	}
	
//excluir aluno
	public void excluirAluno(String nome) {
		var aluno = buscarNome(nome);
		if (aluno != null) {
			alunos[aluno.getPosicao()] = null;
		}
	}

//validar se um aluno já foi inserido (por matricula)
	public boolean validarMatricula(String matricula) {
		var matriculado = buscarMatricula(matricula);
		if (matriculado != null) {
			return false;
		}
		return true;
	}
//alterar dados de um aluno já registrado
	public void alterarDados(String matricula) {
		var dados = buscarMatricula(matricula);
		if (dados != null) {
			Aluno[] alunos = new Aluno[]();
		}
		
	}
}