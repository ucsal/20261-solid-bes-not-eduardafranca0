package br.com.ucsal.olimpiadas;

import java.util.List;

public class QuestaoService {
	private QuestaoRepository repository;
	private ProvaRepository provaRepository;

	public QuestaoService(QuestaoRepository repository, ProvaRepository provaRepository) {
		this.repository = repository;
		this.provaRepository = provaRepository;
	}

	public void cadastrarQuestao(Prova idProva, List<Alternativa> alternativas, String enuciado) {
		
		Prova prova = provaRepository.buscarPorId(idProva.getId());

		if (prova == null) {
			throw new IllegalArgumentException("Prova não encontrada");
		}

		Questao questao = new Questao(idProva, enuciado, alternativas);

		repository.salvar(questao);

	}
	/* 
	 * criei APENAS para cadastrar a questao,
	 * verifica a prova 
	 * cria a questao e  registra no repository
	 * */
}
