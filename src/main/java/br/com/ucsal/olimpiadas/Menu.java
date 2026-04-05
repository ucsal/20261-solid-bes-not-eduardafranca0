package br.com.ucsal.olimpiadas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
	private Scanner sc;
	private Map<Integer, AcaoMenu> opcoes = new LinkedHashMap<Integer, AcaoMenu>();

	public Menu(Scanner sc) {
		this.sc = sc;
	}

	public void adicionarOpcao(int numero, AcaoMenu opcao) {
		opcoes.put(numero, opcao);
	}

	public void mostrar() {

		while (true) {
			System.out.println("\n=== OLIMPÍADA DE QUESTÕES ===");

			for (Map.Entry<Integer, AcaoMenu> entry : opcoes.entrySet()) {
				System.out.println(entry.getKey() + ")" + entry.getValue().getDescricao());
			}
			System.out.print(">");
			int escolha = sc.nextInt();
			sc.nextLine();
			
			AcaoMenu opcao = opcoes.get(escolha);

			if (opcao != null) {
				opcao.executar();
			} else {
				System.out.println("Opção invalida!");
			}
		}
	}

}
