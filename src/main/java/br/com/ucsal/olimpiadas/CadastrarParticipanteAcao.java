package br.com.ucsal.olimpiadas;

import java.util.Scanner;

public class CadastrarParticipanteAcao implements AcaoMenu {
	private ParticipanteService service;
	private Scanner sc;

	public CadastrarParticipanteAcao(ParticipanteService service, Scanner sc) {
		this.service = service;
		this.sc = sc;
	}

	@Override
	public String getDescricao() {
		return "Cadastrar Participante";
	}

	@Override
	public void executar() {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		
		System.out.print("Email(opcional): ");
		String email = sc.nextLine();

		Participante salva = service.cadastrarParticipante(nome, email);

		if (salva != null) {
			System.out.println("Participante cadastrado: " + salva.getId());
		}

	}

}
