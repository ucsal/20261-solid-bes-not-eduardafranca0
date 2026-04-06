package br.com.ucsal.olimpiadas;

import java.util.Scanner;

public class AplicarProvaAcao implements AcaoMenu {
	private ParticipanteRepository participanteRepository;
	private ProvaRepository provaRepository;
	private QuestaoRepository questaoRepository;
	private AplicacaoDeProvaService service;
	private Scanner sc;

	public AplicarProvaAcao(ParticipanteRepository participanteRepository, ProvaRepository provaRepository,
			QuestaoRepository questaoRepository, AplicacaoDeProvaService service, Scanner sc) {
		this.participanteRepository = participanteRepository;
		this.provaRepository = provaRepository;
		this.questaoRepository = questaoRepository;
		this.service = service;
		this.sc = sc;
	}

	@Override
	public String getDescricao() {

		return "Aplicar prova (selecionar participante + prova)";
	}

	@Override
	public void executar() {
		System.out.println("\nParticipantes:");

		for (Participante participante : participanteRepository.listar()) {
			System.out.println(participante.getId() + " - " + participante.getNome());
		}

		System.out.print("Escolha o id do participante: ");
		Long participanteId = sc.nextLong();
		sc.nextLine();

		System.out.println("\nProvas:");

		for (Prova prova : provaRepository.listar()) {
			System.out.println(prova.getId() + " - " + prova.getTitulo());
		}

		System.out.print("Escolha o id da prova: ");
		Long provaId = sc.nextLong();
		sc.nextLine();

		service.validarDados(participanteId, provaId);

		System.out.println("\n--- Início da Prova ---");

		Tentativa tentativa = new Tentativa(provaId, participanteId);

		for (Questao q : questaoRepository.listarPorProva(provaId)) {
			System.out.println("\nQuestão #" + q.getId());
			System.out.println(q.getEnunciado());

			for (Alternativa alt : q.getAlternativas()) {
				System.out.println(alt);
			}

			System.out.print("Sua resposta (A–E): ");
			char marcada = sc.nextLine().toUpperCase().charAt(0);
			Alternativa alternativa = q.buscarAlternativa(marcada);

			if (alternativa != null) {
				tentativa.salvarResposta(new Resposta(q.getId(), alternativa));
			}
		}

		Tentativa fimDeProva = service.aplicarProva(tentativa);

		if (fimDeProva != null) {
			System.out.println("\n--- Fim da Prova ---");
			System.out
					.println("Nota (acertos): " + fimDeProva.getPontuacao() + " / " + tentativa.getRespostas().size());
		}
	}

}
