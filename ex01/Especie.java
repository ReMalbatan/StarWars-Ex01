package ex01;

public abstract class Especie {
	private String nomeEspecie;
	private String corDePele;
	private double minAltura;
	private double maxAltura;
	
	public Especie(String nomeEspecie, String corDePele, double minAltura, double maxAltura) {
		super();
		this.nomeEspecie = nomeEspecie;
		this.corDePele = corDePele;
		this.minAltura = minAltura;
		this.maxAltura = maxAltura;
	}
	public String getNomeEspecie() {
		return nomeEspecie;
	}
	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	public String getCorDePele() {
		return corDePele;
	}
	public void setCorDePele(String corDePele) {
		this.corDePele = corDePele;
	}
	public double getMinAltura() {
		return minAltura;
	}
	public void setMinAltura(double minAltura) {
		this.minAltura = minAltura;
	}
	public double getMaxAltura() {
		return maxAltura;
	}
	public void setMaxAltura(double maxAltura) {
		this.maxAltura = maxAltura;
	}
}
