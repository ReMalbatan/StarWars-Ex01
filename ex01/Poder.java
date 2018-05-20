package ex01;

public class Poder {
	private String nome;
	private int dano;
	
	
	
	public Poder(String nome, int dano) {
		super();
		this.nome = nome;
		this.dano = dano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
}
