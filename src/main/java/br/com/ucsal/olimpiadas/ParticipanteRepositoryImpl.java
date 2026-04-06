package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;

public class ParticipanteRepositoryImpl implements ParticipanteRepository {
	private List<Participante> participantes = new ArrayList<>();
	private long numeroId = 1;

	public Participante salvar(Participante participante) {
		participante.setId(numeroId);
		numeroId++;
		participantes.add(participante);
		return participante;
	}

	public List<Participante> listar() {
		return participantes;
	}

	public Participante buscarPorId(long id) {
		for (Participante participante : participantes) {
			if (participante.getId() == id) {
				return participante;
			}
		}
		return null;
	}
}
