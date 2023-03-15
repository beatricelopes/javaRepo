package src;

public class Aluno {
	protected String nome;
	protected String curso;
	protected String matricula;
	protected double notaP1;
	protected double notaP2;
	protected double notaP3;
	protected double notaP4;
	
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String curso, String matricula, double notaP1, double notaP2, double notaP3,
			double notaP4) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaP3 = notaP3;
		this.notaP4 = notaP4; 
		}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getNotaP1() {
		return notaP1;
	}
	public void setNotaP1(double notaP1) {
		this.notaP1 = notaP1;
	}
	public double getNotaP2() {
		return notaP2;
	}
	public void setNotaP2(double notaP2) {
		this.notaP2 = notaP2;
	}
	public double getNotaP3() {
		return notaP3;
	}
	public void setNotaP3(double notaP3) {
		this.notaP3 = notaP3;
	}
	public double getNotaP4() {
		return notaP4;
	}
	public void setNotaP4(double notaP4) {
		this.notaP4 = notaP4;
	}
}


