/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gato;

/**
 *
 * @author bea
 */

/**
*Em um editor de texto, cole uma figura de um objeto qualquer.
*Defina atributos e métodos para o objeto representado
*Construa a classe referente ao objeto anterior
*A classe deve ter construtor, métodos de acesso
*Implemente uma classe  do tipo interface gráfica para coletar os dados referentes ao objeto
*Instancie objetos de cada classe principal
*Grave dados dos objetos instaciados em um arquivo csv
*Entregue via GitHub.  Poste o link de seu gitHub aqui. ApreSsentação em aula.
**/

public class Gato {
    //atributos
    private char sexo;
    private float altura;
    private float peso;
    private String cor;
    private String nome;
 
//construtor
    public Gato(char sexo, float altura, float peso, String cor, String nome){    
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.cor = cor;
        this.nome = nome;
    }

    Gato() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //getters e setters
    public String getCor() {
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
	this.peso = massa;
    }
	
    public String getNome(){
	return nome;
    }
    public void setNome(String nome) {
	this.nome = nome;
    }

    void setCor(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}