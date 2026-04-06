package br.com.ucsal.olimpiadas;

import java.util.List;

public class ListarTentativasAcao implements AcaoMenu {
	private TentativaRepository tentativaRepository;

	public ListarTentativasAcao(TentativaRepository tentativaRepository) {
		this.tentativaRepository = tentativaRepository;
	}

	@Override
	public String getDescricao() {

		return "Listar tentativas (resumo)";
	}

	@Override
	public void executar() {
		List<Tentativa> tentativas = tentativaRepository.listar();

		System.out.println("\n--- Tentativas ---");

		for (Tentativa t : tentativas) {
			System.out.printf("#%d | participante=%d | prova=%d | nota=%d/%d%n", t.getId(), t.getParticipanteId(),
					t.getProvaId(), t.getPontuacao(), t.getRespostas().size());
		}

	}

}
