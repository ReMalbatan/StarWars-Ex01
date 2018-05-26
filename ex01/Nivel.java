package ex01;

public abstract class Nivel {
	private String nome;
	private int dominioDaForca;
	private int dominioDoSabre;
	
	public Nivel(String nome, int dominioDaForca, int dominioDoSabre) {
		super();
		this.nome = nome;
		this.dominioDaForca = dominioDaForca; //1 mais fraco e 4 mais forte
		this.dominioDoSabre = dominioDoSabre; // 1 mais fraco e 4 mais forte
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
	
	public int getDominioDoSabre() {
		return dominioDoSabre;
	}
	public void setDominioDaForca(int dominioDaForca) {
		this.dominioDaForca = dominioDaForca;
	}
}
