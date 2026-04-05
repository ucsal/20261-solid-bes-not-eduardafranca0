package br.com.ucsal.olimpiadas;

import java.util.List;

public class QuestaoService {
	private QuestaoRepository repository;
	private ProvaRepository provaRepository;

	public QuestaoService(QuestaoRepository repository, ProvaRepository provaRepository) {
		this.repository = repository;
		this.provaRepository = provaRepository;
	}

	public Questao cadastrarQuestao(Long idProva, List<Alternativa> alternativas, String enuciado) {
		if (provaRepository.listar() == null) {
			throw new IllegalArgumentException("não há provas cadastradas");
		}

		Prova prova = provaRepository.buscarPorId(idProva);

		if (prova == null) {
			throw new IllegalArgumentException("Prova não encontrada");
		}

		Questao questao = new Questao(idProva, enuciado, alternativas);

		return repository.salvar(questao);

	}
	
}
