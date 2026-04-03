package br.com.ucsal.olimpiadas;

import java.util.Arrays;
import java.util.List;

public class Questao {

	private int id;
	private Prova prova;
	private String enunciado;
	private List<Alternativa> alternativas;
	
	public Questao(Prova prova, String enuciado, List<Alternativa> alternativas) {
		
		if(alternativas.size()!=5) {
			throw new IllegalArgumentException("A questao deve ter 5 alternativas");
		}
		
		this.prova= prova;
		this.enunciado= enuciado;
		this.alternativas=alternativas;
		
		}

	public void setId(int id) {
		this.id = id;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public List<Alternativa> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<Alternativa> alternativas) {
		this.alternativas = alternativas;
	}

	
	}
//	public void setAlternativas(String[] alternativas) {
//		if (alternativas == null || alternativas.length != 5) {
//			throw new IllegalArgumentException("A questão deve possuir exatamente 5 alternativas.");
//		}
//		this.alternativas = Arrays.copyOf(alternativas, 5);
//	}
//
//	public char getAlternativaCorreta() {
//		return alternativaCorreta;
//	}
//
//	public void setAlternativaCorreta(char alternativaCorreta) {
//		this.alternativaCorreta = normalizar(alternativaCorreta);
//	}
//
//	public boolean isRespostaCorreta(char marcada) {
//		return normalizar(marcada) == alternativaCorreta;
//	}
//
//	public static char normalizar(char c) {
//		char up = Character.toUpperCase(c);
//		if (up < 'A' || up > 'E') {
//			throw new IllegalArgumentException("Alternativa deve estar entre A e E.");
//		}
//		return up;
//	}


