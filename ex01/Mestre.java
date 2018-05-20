package ex01;

public class Mestre extends Nivel {
	private int campoVidencia;
	
	public Mestre(int campoVidencia) {
		super("Mestre", 4);
		this.campoVidencia = campoVidencia;
		
	}

	public int getCampoVidencia() {
		return campoVidencia;
	}

	public void setCampoVidencia(int campoVidencia) {
		this.campoVidencia = campoVidencia;
	}
}
