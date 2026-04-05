package br.com.ucsal.olimpiadas;

public class Alternativa {
	private char letra;
	private String texto;
	private boolean correta;

	public Alternativa(char letra, String texto) {
		this.setLetra(letra);
		this.texto = texto;
		this.correta = false;
	}

	public String getTexto() {
		return texto;
	}

	public boolean isCorreta() {
		return correta;
	}

	public void setCorreta(boolean correta) {
		this.correta = correta;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return letra + ") " + getTexto();
	}

}
