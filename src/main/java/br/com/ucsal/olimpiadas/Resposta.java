package br.com.ucsal.olimpiadas;

public class Resposta {

	private long questaoId;
	private Alternativa alternativaMarcada;

	public long getQuestaoId() {
		return questaoId;
	}

	public void setQuestaoId(long questaoId) {
		this.questaoId = questaoId;
	}

	public Alternativa getAlternativaMarcada() {
		return alternativaMarcada;
	}

	public void setAlternativaMarcada(Alternativa alternativaMarcada) {
		this.alternativaMarcada = alternativaMarcada;
	}


}
