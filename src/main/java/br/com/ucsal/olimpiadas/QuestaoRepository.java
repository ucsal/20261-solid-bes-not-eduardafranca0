package br.com.ucsal.olimpiadas;

import java.util.List;

public interface QuestaoRepository {
	void salvar(Questao questao);
	List<Questao> listarPorProva(Long provaId);
}
