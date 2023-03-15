package src;

public class alunoCadastro {
	
	
	protected String nome;
	protected String curso;
	protected String matricula;
	protected String notaP1;
	protected String notaP2;
	protected String notaP3;
	protected String notaP4;
	
	public alunoCadastro() {
		
	}
	public alunoCadastro(String nome, String curso, String matricula, String notaP1, String notaP2, String notaP3,
			String notaP4) {
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
	public String getNotaP1() {
		return notaP1;
	}
	public void setNotaP1(String notaP1) {
		this.notaP1 = notaP1;
	}
	public String getNotaP2() {
		return notaP2;
	}
	public void setNotaP2(String notaP2) {
		this.notaP2 = notaP2;
	}
	public String getNotaP3() {
		return notaP3;
	}
	public void setNotaP3(String notaP3) {
		this.notaP3 = notaP3;
	}
	public String getNotaP4() {
		return notaP4;
	}
	public void setNotaP4(String notaP4) {
		this.notaP4 = notaP4;
	}

}


