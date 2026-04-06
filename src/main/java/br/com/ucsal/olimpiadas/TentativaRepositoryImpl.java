package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;

public class TentativaRepositoryImpl implements TentativaRepository {
	private List<Tentativa> tentativas = new ArrayList<>();
	private int numeroId = 1;

	@Override
	public void salvarTentativa(Tentativa tentativa) {
		tentativa.setId(numeroId);
		numeroId++;
		tentativas.add(tentativa);
	}

	@Override
	public List<Tentativa> listar() {
		return tentativas;
	}

}
