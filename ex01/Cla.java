package ex01;

public class Cla {
	private Jedi mestreTreinador;
	private Jedi[] alunos;
	private String dataFundacao;
	
	public Cla(Jedi mestreTreinador, Jedi[] alunos, String dataFundacao) {
		super();
		this.mestreTreinador = mestreTreinador;
		this.alunos = alunos;
		this.dataFundacao = dataFundacao;
	}
	
	public Jedi getMestreTreinador() {
		return mestreTreinador;
	}
	public void setMestreTreinador(Jedi mestreTreinador) {
		this.mestreTreinador = mestreTreinador;
	}
	public Jedi[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Jedi[] alunos) {
		this.alunos = alunos;
	}
	public String getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	
}
