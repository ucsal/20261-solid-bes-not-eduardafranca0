package br.com.ucsal.olimpiadas;

public class ProvaService {
	private ProvaRepository repository;

	public ProvaService(ProvaRepository repository) {
		this.repository = repository;
	}

	public Prova cadastrarProva(String titulo) {
		if (titulo == null || titulo.isBlank()) {
			throw new IllegalArgumentException("título inválido");
		}
		Prova prova = new Prova(titulo);

		return repository.salvar(prova);
	}
}
