package ex01;

public class Poder {
	private String nome;
	private int dano;
	private int prioridade; //forca = 2, sabre = 1
	
	
	
	public Poder(String nome, int dano, int prioridade) {
		super();
		this.nome = nome;
		this.dano = dano;
		this.prioridade = prioridade;
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
	
	public int getPrioridade() {
		return prioridade;
	}
	
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
}
