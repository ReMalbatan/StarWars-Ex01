package ex01;

public class Sabre {
	private String formato;
	private String cor;
	
	public Sabre(String formato, String cor) {
		super();
		this.formato = formato;
		this.cor = cor;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
