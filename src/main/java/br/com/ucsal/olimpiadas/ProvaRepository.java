package br.com.ucsal.olimpiadas;

import java.util.List;

public interface ProvaRepository {
	void salvar(Prova prova);
	List<Prova> listar();
	Prova buscarPorId(Long id);
}
