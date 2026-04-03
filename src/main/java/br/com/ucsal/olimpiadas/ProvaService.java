package br.com.ucsal.olimpiadas;

public class ProvaService {
	private ProvaRepository repository;

	public ProvaService(ProvaRepository repository) {
		this.repository = repository;
	}

	public void cadastrarProva(String titulo) {
		if (titulo == null || titulo.isBlank()) {
			System.out.println("título inválido");
			return;
		}
			Prova prova = new Prova(titulo);
			
			repository.salvar(prova);
			System.out.println("Prova criada: " + prova.getId());
		}
}
