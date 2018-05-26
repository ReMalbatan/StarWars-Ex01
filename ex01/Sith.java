package ex01;

public class Sith extends Pessoa {
	private String novoNome; //Um sith pode escolher ser chamado por um novo nome
	private Nivel nvl; //Graduacao do Sith
	private Poder[] poderes;
	
	public Sith() {
		super();
	}
	
	public Sith(String antigoNome, String genero, Especie esp, String dataNascimento, String novoNome, Nivel nvl, Poder[] poderes) {
		super(antigoNome, genero, esp, dataNascimento);
		this.novoNome = novoNome;
		this.nvl = nvl;
		this.poderes = poderes;
	}
	public String getNovoNome() {
		return novoNome;
	}
	public void setNovoNome(String novoNome) {
		this.novoNome = novoNome;
	}
	public Nivel getNvl() {
		return nvl;
	}
	public void setNvl(Nivel nvl) {
		this.nvl = nvl;
	}
	public Poder[] getPoderes() {
		return poderes;
	}
	public void setPoderes(Poder[] poderes) {
		this.poderes = poderes;
	}
	
	
}
