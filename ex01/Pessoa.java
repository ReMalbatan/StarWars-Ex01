package ex01;

public class Pessoa {
	private String nome;
	private String genero;
	private Especie esp;
	private String dataNascimento;
	private Planeta planetaNatal;

	public Pessoa(String genero, Especie esp, String dataNascimento) {
		super();
		this.genero = genero;
		this.esp = esp;
		this.dataNascimento = dataNascimento;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Especie getEsp() {
		return esp;
	}
	public void setEsp(Especie esp) {
		this.esp = esp;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Planeta getPlanetaNatal() {
		return planetaNatal;
	}

	public void setPlanetaNatal(Planeta planetaNatal) {
		this.planetaNatal = planetaNatal;
	}

	
}
