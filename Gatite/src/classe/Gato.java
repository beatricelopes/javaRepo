/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author beatr
 */
public class Gato {
    //atributos
    protected String sexo;
    protected float altura;
    protected float peso;
    protected String cor;
    protected String nome;  
    protected String dono;
    
    public Gato() {
		
	}


    public Gato(String sexo, float altura, float peso, String cor, String nome) {
		super();
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.cor = cor;
		this.nome = nome;
		
    }


	public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


	@Override
	public String toString() {
		return "Gato [sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + ", cor=" + cor + ", nome=" + nome + "]";
	}
    
    
    
    

}
