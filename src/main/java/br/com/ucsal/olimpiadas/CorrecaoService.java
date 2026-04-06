package br.com.ucsal.olimpiadas;

public class CorrecaoService {

	public int corrigir(Tentativa tentativa) {
		int acertos = 0;
		for (Resposta resposta : tentativa.getRespostas()) {
			if (resposta.getAlternativaMarcada().isCorreta()) {
				acertos++;
			}
		}
		return acertos;
	}

}
