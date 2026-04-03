package br.com.ucsal.olimpiadas;

public class ParticipanteService {
	private ParticipanteRepository repository;

	public ParticipanteService(ParticipanteRepository repository) {
		this.repository = repository;
	}

	public void cadastrarParticipante(String nome, String email) {
		if (nome == null || nome.isBlank()) {
			System.out.println("nome inválido");
			return;
		}
		Participante participante = new Participante(nome, email);
		repository.salvar(participante);

		System.out.println("Paricipante cadastrado: " + participante.getId());
	}
}
