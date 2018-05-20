package ex01;

public abstract class Nivel {
	private String nome;
	private int dominioDaForca;
	
	public Nivel(String nome, int dominioDaForca) {
		super();
		this.nome = nome;
		this.dominioDaForca = dominioDaForca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDominioDaForca() {
		return dominioDaForca;
	}
	public void setDominioDaForca(int dominioDaForca) {
		this.dominioDaForca = dominioDaForca;
	}
}
