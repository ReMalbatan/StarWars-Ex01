package ex01;

public class Mestre extends Nivel {
	private int campoVidencia;
	
	public Mestre(int campoVidencia, int dominioForca, int dominioSabre) {
		super("Mestre", dominioForca, dominioSabre);
		this.campoVidencia = campoVidencia;
		
	}

	public int getCampoVidencia() {
		return campoVidencia;
	}

	public void setCampoVidencia(int campoVidencia) {
		this.campoVidencia = campoVidencia;
	}
}
