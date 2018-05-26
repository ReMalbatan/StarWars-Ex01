package ex01;

public class Especie {
	private String nomeEspecie;
	private double altura;
	
	public Especie(String nomeEspecie, double altura) {
		super();
		this.nomeEspecie = nomeEspecie;
		this.altura = altura;
	}
	
	public String getNomeEspecie() {
		return nomeEspecie;
	}
	
	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
