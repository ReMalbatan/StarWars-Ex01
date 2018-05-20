package ex01;

public class AprendizSith extends Nivel {
	boolean saberMontarSabre;
	
	
	public AprendizSith(String nome, int dominioDaForca, boolean saberMontarSabre) {
		super("Aprendiz", 2);
		this.saberMontarSabre = saberMontarSabre;
	}
	public boolean isSaberMontarSabre() {
		return saberMontarSabre;
	}

	public void setSaberMontarSabre(boolean saberMontarSabre) {
		this.saberMontarSabre = saberMontarSabre;
	}
	
	
}
