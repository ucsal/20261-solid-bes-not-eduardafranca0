package br.com.ucsal.olimpiadas;

public class Prova {

	private long id;
	private String titulo;

	public Prova(String titulo) {
		this.titulo = titulo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

}
