package br.com.ucsal.olimpiadas;

import java.util.List;

public interface ProvaRepository {
	Prova salvar(Prova prova);

	List<Prova> listar();

	Prova buscarPorId(Long id);
}
