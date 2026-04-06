package br.com.ucsal.olimpiadas;

public class SairAcao implements AcaoMenu {

	@Override
	public String getDescricao() {

		return "Sair";
	}

	@Override
	public void executar() {
		System.out.println("tchau");
		return;
	}

}
