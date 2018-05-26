package ex01;

public class Jedi extends Pessoa{
	private Nivel nvl; //Graduacao do Jedi
	private Poder[] poderes;
	
	public Jedi() {
		super();
	}
	
	public Jedi(String nome, String genero, Especie esp, String dataNascimento, Nivel nvl, Poder[] poderes) {
		super(nome, genero, esp, dataNascimento);
		this.nvl = nvl;
		this.poderes = poderes;
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
