package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastrarQuestaoAcao implements AcaoMenu {
	private QuestaoService service;
	private QuestaoRepository repository;
	private ProvaRepository provaRepository;
	private Scanner sc;

	public CadastrarQuestaoAcao(QuestaoService service, QuestaoRepository repository, ProvaRepository provaRepository,
			Scanner sc) {
		this.provaRepository = provaRepository;
		this.repository = repository;
		this.sc = sc;
		this.service = service;
	}

	@Override
	public String getDescricao() {

		return "Cadastrar questão (A–E) em uma prova ";
	}

	@Override
	public void executar() {

		System.out.println("Escolha o id da prova: ");
		for (Prova prova : provaRepository.listar()) {
			System.out.println(prova.getId() + " - " + prova.getTitulo());
		}

		Long provaId = sc.nextLong();
		sc.nextLine();

		System.out.println("Enunciado:");
		String enuciado = sc.nextLine();

		List<Alternativa> alternativas = new ArrayList<>();
		for (char letra = 'A'; letra <= 'E'; letra++) {
			System.out.print("Alternativa " + letra + ": ");
			String textoDaAlternativa = sc.nextLine();

			alternativas.add(new Alternativa(letra, textoDaAlternativa));
		}

		System.out.print("Alternativa correta (A–E): ");

		char letraCorreta = sc.nextLine().toUpperCase().charAt(0);

		for (Alternativa alt : alternativas) {
			if (alt.getLetra() == letraCorreta) {
				alt.setCorreta(true);
			}
		}
		Questao salva = service.cadastrarQuestao(provaId, alternativas, enuciado);

		if (salva != null) {
			System.out.println(
					"Questão cadastrada: " + repository.listarPorProva(provaId).size() + " (na prova " + provaId + ")");
		}
	}

}
