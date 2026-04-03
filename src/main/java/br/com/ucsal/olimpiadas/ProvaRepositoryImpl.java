package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;

public class ProvaRepositoryImpl implements ProvaRepository{
	protected List<Prova> provas = new ArrayList<>();
	private long numeroId=1;
	
	public void salvar(Prova prova) {
		prova.setId(numeroId);
		numeroId++;
		provas.add(prova);
	}
	
	public List<Prova> listar() {
		return provas;
		}
				
	public Prova buscarPorId(Long id) {
		for(Prova prova: provas) {
			if(prova.getId()==id) {
				return prova;
			}
		}
		return null;
	}


	
	
}