package src;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo");
		mostrarOpcoes();
		int opcao = scanner.nextInt();
		
		Turma turma = new Turma();
		scanner.nextLine();

		while(opcao < 7){
			switch(opcao){
				case 1: 
					turma.imprimirAluno(); 
					break;
				case 2: 
					System.out.println("Infomre o nome:");
					Aluno alunoNome = turma.buscarNome(scanner.nextLine()); 
					turma.mostrarDadosAluno(alunoNome);
					break;
				case 3: 
					System.out.println("Infomre a matricula:");
					Aluno alunoMatricula = turma.buscarMatricula(scanner.nextLine()); 
					turma.mostrarDadosAluno(alunoMatricula);
					break;
				case 4: 
					System.out.println("Informe a matricula");
					String matriculaCriar = scanner.nextLine();
					Aluno alunoCriar = criarAluno(scanner);
					alunoCriar.setMatricula(matriculaCriar);
					turma.adicionarAluno(alunoCriar); 
					break;
				case 5: 
					System.out.println("Informe a matricula do aluno que deve ser atualizado");
					String matriculaAtualizar = scanner.nextLine();

					if(turma.buscarMatricula(matriculaAtualizar) == null){
						System.out.println("Aluno nao encontrado");
						break;
					}

					Aluno alunoAtualizar = criarAluno(scanner);
					alunoAtualizar.setMatricula(matriculaAtualizar);
					turma.alterarDados(matriculaAtualizar, alunoAtualizar); 
					break;
				case 6: 
					System.out.println("Informe a matricula:");
					turma.excluirAluno(scanner.nextLine()); break;
				case 7: 
					break;
			}

			mostrarOpcoes();
			System.out.println();
			System.out.println("Proxima acao: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
		}
		
		scanner.close();
	}

	public static Aluno criarAluno(Scanner scanner){
		var aluno = new Aluno();

		System.out.println("Informe o nome");
		String nome = scanner.nextLine();
		aluno.setNome(nome);
		
		System.out.println("Informe o curso");
		String curso = scanner.nextLine();
		aluno.setCurso(curso);
		
		Prova p1 = criarProva(scanner);
		aluno.setNotaP1(p1);
		
		Prova p2 = criarProva(scanner);
		aluno.setNotaP2(p2);
		
		Prova p3 = criarProva(scanner);
		aluno.setNotaP3(p3);
		
		Prova p4 = criarProva(scanner);
		aluno.setNotaP4(p4);
		
		return aluno;
	}

	public static Prova criarProva(Scanner scanner){
		System.out.println("Informe a nota");
		var nota = scanner.nextDouble();

		System.out.println("Informe o peso");
		var peso = scanner.nextDouble();
				
		return new Prova(nota,peso);
	}

	public static void mostrarOpcoes(){
		System.out.println("Escolha uma das opcoes abaixo");
		System.out.println("1 - Imprimir alunos");
		System.out.println("2 - Consultar por nome");
		System.out.println("3 - Consultar por matricula");
		System.out.println("4 - Inserir um aluno");
		System.out.println("5 - Alterar dados do aluno");
		System.out.println("6 - Excluir um aluno");
		System.out.println("7 - Sair");
	}
}
