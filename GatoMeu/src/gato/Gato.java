/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gato;

/**
 *
 * @author bea
 */
public class Gato {
    //atributos
    private char sexo;
    private float altura;
    private float peso;
    private String cor;
    private String nome;
 
//construtor
    public Gato (String cor, String nome){
        cor=cor;
        this.nome=nome;
    }
    public Gato (String nome, char Sexo){
	this.nome=nome;    
	sexo=Sexo;
    }
    public Gato(){
    }
   
    //getters e setters
    public String getCor(){
        return cor;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getPeso(){
	return peso;
    }
    public void setPeso(float massa){
	this.peso = peso;
    }
	
    public String getNome(){
	return nome;
    }
    public void setNome(String nome) {
	this.nome = nome;
    }

    //métodos da classe
    public void andar(int passos) {System.out.println("Andei "+ passos+ " passos");}
    public void miar(String oque) {System.out.println("Miado:  " + oque);}
    public void ouvir()           {}
    public boolean ronronar()     {return true;}
    public void comer(String oque){}
}
