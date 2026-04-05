package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;

public class QuestaoRepositoryImpl implements QuestaoRepository {
	private List<Questao> questoes = new ArrayList<>();
	private int numeroId = 1;

	@Override
	public Questao salvar(Questao questao) {
		questao.setId(numeroId);
		numeroId++;
		questoes.add(questao);
		return questao;
	}

	@Override
	public List<Questao> listarPorProva(Long provaId) {

		List<Questao> questao = new ArrayList<>();
		for (Questao q : questoes) {
			if (q.getProvaId().equals(provaId)) {
				questao.add(q);
			}
		}
		return questao;
	}

}
