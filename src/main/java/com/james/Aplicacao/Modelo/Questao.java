package com.james.Aplicacao.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questao")
public class Questao {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	private String enunciado;
	private String respostaA;
	private String respostaB;
	private String respostaC;
	private String respostaD;
	private Character respostaCerta;

	public Questao() {
		
		
		
	}
	
	public Questao(String enunciado, String respostaA, String respostaB, String respostaC, String respostaD,
			Character respostaCerta) {

		if (respostaCerta < 'a' || respostaCerta > 'd') // Nota: Resposta certa inválida
		{
			throw new IllegalArgumentException("Resposta " + respostaCerta + "inválida");
		}

		this.enunciado = enunciado;
		this.respostaA = respostaA;
		this.respostaB = respostaB;
		this.respostaC = respostaC;
		this.respostaD = respostaD;
		this.respostaCerta = respostaCerta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getRespostaA() {
		return respostaA;
	}

	public void setRespostaA(String respostaA) {
		this.respostaA = respostaA;
	}

	public String getRespostaB() {
		return respostaB;
	}

	public void setRespostaB(String respostaB) {
		this.respostaB = respostaB;
	}

	public String getRespostaC() {
		return respostaC;
	}

	public void setRespostaC(String respostaC) {
		this.respostaC = respostaC;
	}

	public String getRespostaD() {
		return respostaD;
	}

	public void setRespostaD(String respostaD) {
		this.respostaD = respostaD;
	}

	public char getRespostaCerta() {
		return respostaCerta;
	}

	public void setRespostaCerta(char respostaCerta) {
		this.respostaCerta = respostaCerta;
	}

	@Override
	public String toString() {
		return "Questao [id=" + id + ", enunciado=" + enunciado + ", respostaA=" + respostaA + ", respostaB="
				+ respostaB + ", respostaC=" + respostaC + ", respostaD=" + respostaD + ", respostaCerta="
				+ respostaCerta + "]";
	}
	
	

}
