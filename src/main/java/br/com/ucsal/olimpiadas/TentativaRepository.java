package br.com.ucsal.olimpiadas;

import java.util.List;

public interface TentativaRepository {
	void salvarTentativa(Tentativa tentativa);

	List<Tentativa> listar();
}
