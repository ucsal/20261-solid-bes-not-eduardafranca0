package br.com.ucsal.olimpiadas;

import java.util.Scanner;

public class CadastrarProvaAcao implements AcaoMenu {
	private ProvaService service;
	private Scanner sc;

	public CadastrarProvaAcao(ProvaService service, Scanner sc) {
		this.service = service;
		this.sc = sc;
	}

	@Override
	public String getDescricao() {

		return "Cadastrar Prova";
	}

	@Override
	public void executar() {
		System.out.println("Titulo: ");
		String titulo = sc.nextLine();

		Prova salva = service.cadastrarProva(titulo);

		if (salva != null) {
			System.out.println("Prova criada: " + salva.getId());
		}
	}

}
