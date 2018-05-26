package ex01;

public class Lorde extends Nivel{
	private int campoDeVidencia;

	public Lorde(int campoDeVidencia, int dominioForca, int dominioSabre) {
		super("Lorde", dominioForca, dominioSabre); 
		this.campoDeVidencia = campoDeVidencia;
	}

	public int getCampoDeVidencia() {
		return campoDeVidencia;
	}

	public void setCampoDeVidencia(int campoDeVidencia) {
		this.campoDeVidencia = campoDeVidencia;
	}
	
}
