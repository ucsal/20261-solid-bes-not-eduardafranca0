package br.com.ucsal.olimpiadas;

public class AplicacaoDeProvaService {
	private ProvaRepository provaRepository;
	private ParticipanteRepository participanteRepository;
	private CorrecaoService correcaoService;
	private TentativaRepository tentativas;
	private QuestaoRepository questaoRepository;

	public AplicacaoDeProvaService(ProvaRepository provaRepository, QuestaoRepository questaoRepository,
			ParticipanteRepository participanteRepository, CorrecaoService correcaoService,
			TentativaRepository tentantivas) {
		this.provaRepository = provaRepository;
		this.questaoRepository = questaoRepository;
		this.participanteRepository = participanteRepository;
		this.correcaoService = correcaoService;
		this.tentativas = tentantivas;
	}

	public void validarDados(Long participanteId, Long provaId) {
		if (participanteRepository.listar() == null) {
			throw new IllegalArgumentException("cadastre participantes primeiro");
		}
		if (provaRepository.listar() == null) {
			throw new IllegalArgumentException("cadastre prova primeiro");
		}

		Prova prova = provaRepository.buscarPorId(provaId);
		Participante participante = participanteRepository.buscarPorId(participanteId);

		if (participante == null) {
			throw new IllegalArgumentException("Participante não encontrado");
		}
		if (prova == null) {
			throw new IllegalArgumentException("Prova não encontada");
		}

		if (questaoRepository.listarPorProva(provaId) == null) {
			throw new IllegalArgumentException("esta prova não possui questões cadastradas");
		}

	}

	public Tentativa aplicarProva(Tentativa tentativa) {
		int pontuacao = correcaoService.corrigir(tentativa);

		tentativa.setPontuacao(pontuacao);
		tentativas.salvarTentativa(tentativa);
		return tentativa;
	}
}
