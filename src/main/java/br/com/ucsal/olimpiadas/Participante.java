package br.com.ucsal.olimpiadas;

public class Participante {
	private long id;
	private String nome;
	private String email;

	public Participante(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setId(long id) {
		this.id = id;
	}

}
