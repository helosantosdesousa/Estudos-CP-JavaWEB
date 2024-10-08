package br.com.fiap.model;

public class Aluno {
	private double nota1=0;
	private double nota2=0;
	private String nome;
	private boolean aprovado;
	//double media=0;
	String situacao;
	public String verificaSituacao(double media){
		if(media>=6) {
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}
		return situacao;
	}
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	

}
