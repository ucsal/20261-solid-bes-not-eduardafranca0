package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;

public class Tentativa {
	private long provaId;
	private long participanteId;
	private int pontuacao;
	private List<Resposta> respostas = new ArrayList<>();
	
	public Tentativa(long provaId, long participanteId) {
		this.provaId=provaId;
		this.setParticipanteId(participanteId);
	}
	public void salvarResposta(Resposta resposta) {
		respostas.add(resposta);
	}

	public long getProvaId() {
		return provaId;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}
	public long getParticipanteId() {
		return participanteId;
	}
	public void setParticipanteId(long participanteId) {
		this.participanteId = participanteId;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}


}
