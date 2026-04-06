package br.com.ucsal.olimpiadas;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ParticipanteRepository participanteRepository = new ParticipanteRepositoryImpl();
		ProvaRepository provaRepository = new ProvaRepositoryImpl();
		QuestaoRepository questaoRepository = new QuestaoRepositoryImpl();
		TentativaRepository tentativaRepository = new TentativaRepositoryImpl();

		ParticipanteService participanteService = new ParticipanteService(participanteRepository);
		ProvaService provaService = new ProvaService(provaRepository);
		QuestaoService questaoService = new QuestaoService(questaoRepository, provaRepository);
		CorrecaoService correcaoService = new CorrecaoService();
		AplicacaoDeProvaService aplicarProvaService = new AplicacaoDeProvaService(provaRepository, questaoRepository,
				participanteRepository, correcaoService, tentativaRepository);

		Menu menu = new Menu(sc);
		menu.adicionarOpcao(1, new CadastrarParticipanteAcao(participanteService, sc));
		menu.adicionarOpcao(2, new CadastrarProvaAcao(provaService, sc));
		menu.adicionarOpcao(3, new CadastrarQuestaoAcao(questaoService, questaoRepository, provaRepository, sc));
		menu.adicionarOpcao(4, new AplicarProvaAcao(participanteRepository, provaRepository, questaoRepository,
				aplicarProvaService, sc));
		menu.adicionarOpcao(5, new ListarTentativasAcao(tentativaRepository));
		menu.adicionarOpcao(0, new SairAcao());

		menu.mostrar();

	}
}