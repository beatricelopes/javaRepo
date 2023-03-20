package src;

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
			if (alunos[i] != null && alunos[i].getMatricula().equals(matricula)) {
				return alunos[i];
			}
		}
		return null;
	}
	
//consultar aluno em turma por nome 
	public Aluno buscarNome(String nome) {
		for (int i=0; i<alunos.length; i++) {
			if (alunos[i] != null && alunos[i].getNome().equals(nome)) {
				return alunos[i];
			}
		}
		return null;
	}
	
//imprimir lista de alunos
	public void imprimirAluno(){
		for(int i=0; i<alunos.length; i++) {
			var aluno = alunos[i];

			if(aluno != null){
				mostrarDadosAluno(aluno);	
			}
		}
	}

	public void mostrarDadosAluno(Aluno aluno) {
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Curso: " + aluno.getCurso());
		System.out.println("Matricula: " + aluno.getMatricula());
		System.out.println("Nota 1: " + aluno.getNotaP1().getNota());
		System.out.println("Peso 1: " + aluno.getNotaP1().getPeso());
		System.out.println("Nota 2: " + aluno.getNotaP2().getNota());
		System.out.println("Peso 2: " + aluno.getNotaP2().getPeso());
		System.out.println("Nota 3: " + aluno.getNotaP3().getNota());
		System.out.println("Peso 3: " + aluno.getNotaP3().getPeso());
		System.out.println("Nota 4: " + aluno.getNotaP4().getNota());
		System.out.println("Peso 4: " + aluno.getNotaP4().getPeso());
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
	public void alterarDados(String matricula, Aluno novoAluno) {
		var dados = buscarMatricula(matricula);
		if (dados != null) {
			alunos[dados.getPosicao()] = novoAluno;
		}
	} 
}