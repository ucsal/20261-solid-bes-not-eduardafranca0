package br.com.ucsal.olimpiadas;

import java.util.List;

public class Questao {

	private int id;
	private Long provaId;
	private String enunciado;
	private List<Alternativa> alternativas;

	public Questao(Long provaId, String enuciado, List<Alternativa> alternativas) {

		if (alternativas.size() != 5) {
			throw new IllegalArgumentException("A questao deve ter 5 alternativas");
		}

		this.provaId = provaId;
		this.enunciado = enuciado;
		this.alternativas = alternativas;

	}

	public void setId(int id) {
		this.id = id;
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

	public Alternativa buscarAlternativa(char marcada) {
		for (Alternativa alt : alternativas) {
			if (alt.getLetra() == marcada) {
				return alt;
			}
		}
		return null;
	}

	public Long getProvaId() {
		return provaId;
	}

	public void setProvaId(Long provaId) {
		this.provaId = provaId;
	}

	public int getId() {
		return id;
	}

}
