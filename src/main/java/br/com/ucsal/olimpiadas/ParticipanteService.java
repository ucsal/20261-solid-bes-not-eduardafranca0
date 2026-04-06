package br.com.ucsal.olimpiadas;

public class ParticipanteService {
	private ParticipanteRepository repository;

	public ParticipanteService(ParticipanteRepository repository) {
		this.repository = repository;
	}

	public Participante cadastrarParticipante(String nome, String email) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("nome inválido");
		}
		Participante participante = new Participante(nome, email);
		return repository.salvar(participante);
	}
}
