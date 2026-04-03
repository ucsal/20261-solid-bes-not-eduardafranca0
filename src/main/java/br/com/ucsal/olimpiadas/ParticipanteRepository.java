package br.com.ucsal.olimpiadas;

import java.util.List;

public interface ParticipanteRepository {
	void salvar(Participante participante);
	List<Participante> listar();
	Participante buscarPorId(long id);
}
/*usei a interface em todos os Repository´s,
 *  Assim o Service dependerá de absttraçoes e não de classe concreta,
 *    permitindo trocar a fprma de salvar sem nenhuma alterção no Service
 * */
