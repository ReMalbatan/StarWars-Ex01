package ex01;

public class Padawan extends Nivel{
	private Jedi mestreTreinador;
	private boolean tranca;
	
	public Padawan(String nome, int dominioDaForca, Jedi mestreTreinador, boolean tranca) {
		super("Padawan", 2, 2);
		this.mestreTreinador = mestreTreinador;
		this.tranca = tranca;
	}
	public Jedi getMestreTreinador() {
		return mestreTreinador;
	}
	public void setMestreTreinador(Jedi mestreTreinador) {
		this.mestreTreinador = mestreTreinador;
	}
	public boolean isTranca() {
		return tranca;
	}
	public void setTranca(boolean tranca) {
		this.tranca = tranca;
	}
	
	
}
