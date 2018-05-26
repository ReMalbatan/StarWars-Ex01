package ex02;
import ex01.*;

public class Batalha {
	public static int evento() {
		if (Math.random() >= 0.5)
			return 0; //0 = esquivar
		return 1; //1 = atacar (com uma habilidade)
	}
	
	public static int habAtaque() {
		double i = Math.random();
		if (i >= 0 && i < 0.25)
			return 0;
		else if (i >= 0.25 && i < 0.5)
			return 1;
		else if (i >= 0.5 && i < 0.75)
			return 2;
		else
			return 3;
	}
	
	public static Jedi montaJedi(String nome, String nomeEspecie, String genero, double altura, String nascimento) {
		Mestre mestre = new Mestre(18000);
		Especie espJedi = new Especie(nomeEspecie, altura);
		Poder[] poderJedi = new Poder[4];
		poderJedi[0] = new Poder("Super Soco (força)", 4, 2);
		poderJedi[1] = new Poder("Corte Fatal (sabre)", 16, 1);
		poderJedi[2] = new Poder("Sangramento (força)", 8, 2);
		poderJedi[3] = new Poder("Instinto Sabre Supremo (sabre)", 32, 1);
		Jedi jedi = new Jedi(nome, genero, espJedi, nascimento, mestre, poderJedi);
		
		return jedi;
	}
	
	public static Sith montaSith(String antigoNome, String novoNome, String nomeEspecie, String genero, double altura, String nascimento) {
		Lorde lorde = new Lorde(15000);
		Especie espSith = new Especie(nomeEspecie, altura);
		Poder[] poderSith = new Poder[4];
		poderSith[0] = new Poder("Palma Maligna (força)", 8, 2);
		poderSith[1] = new Poder("Tremor da Escuridao (força)", 10, 2);
		poderSith[2] = new Poder("Corte da Escuridao (sabre)", 20, 1);
		poderSith[3] = new Poder("Instinto Maligno (sabre)", 22, 1);
		Sith sith = new Sith(antigoNome, genero, espSith, nascimento, novoNome, lorde, poderSith);
		
		return sith;
	}
	
	public static void luta(Jedi jedi, Sith sith) {
		boolean jediAtaca, sithAtaca;
		int hab, acao;
		
		Poder[] poderJedi = jedi.getPoderes();
		Poder[] poderSith = sith.getPoderes();
		jediAtaca = sithAtaca = false;
		
		
		System.out.println("Star Wars Episodio 1010: Guerra Binaria");
		System.out.println();
		System.out.println("Mestre Jedi " + jedi.getNome() + " Vs " + "Sith " + sith.getNovoNome());
		System.out.println();
		System.out.println();
		System.out.println("-------------------");
		
		while(true) {
			hab = habAtaque();
			
			if (Math.random() >= 0.5) {
				jediAtaca =  true;
				sithAtaca = false;
				System.out.println(jedi.getNome() + "(" + jedi.getVida() + ") ataca com " + poderJedi[hab].getNome());
			}
			else {
				sithAtaca = true;
				jediAtaca = false;
				System.out.println(sith.getNovoNome() + "(" + sith.getVida() + ") ataca com " + poderSith[hab].getNome());
			}
			
			acao = evento(); //Decide se o oponente ira contra-atacar ou se esquivar
						
			if(sithAtaca == false) {
				if (acao == 0) { //Sith tentara se defender
					if (poderJedi[hab].getPrioridade() == 1) { //Ataques com sabre tem prioridade 1 (Sith esquiva)
						System.out.println(sith.getNovoNome() + "(" + sith.getVida() + ") esquiva!");
					}
					else { //Sith tentou se esquivar de ateque com forca (nao tem efeito)
						sith.setVida(sith.getVida() - poderJedi[hab].getDano()); //Sith sofre o dano do golpe do Jedi
						if (sith.getVida() < 0)
							sith.setVida(0);
						System.out.println(sith.getNovoNome() + "(" + sith.getVida() + ") leva dano de " + poderJedi[hab].getDano());
					}
				}
				else { //Sith tentara contra-atacar
					System.out.println(sith.getNovoNome() + "(" + sith.getVida() + ") contra-ataca com " + poderSith[hab].getNome());
					//Sofre dano quem tiver menor prioridade
					if (poderJedi[hab].getPrioridade() > poderSith[hab].getPrioridade()) {
						sith.setVida(sith.getVida() - poderJedi[hab].getDano()); //Sith sofre o dano do golpe do Jedi
						if (sith.getVida() < 0)
							sith.setVida(0);
						System.out.println(sith.getNovoNome() + "(" + sith.getVida() + ") leva dano de " + poderJedi[hab].getDano());
					}
					else {
						jedi.setVida(jedi.getVida() - poderSith[hab].getDano()); //Jedi sofre o dano do contra golpe do Sith
						if (jedi.getVida() < 0)
							jedi.setVida(0);
						System.out.println(jedi.getNome() + "(" + jedi.getVida() + ") leva dano de " + poderSith[hab].getDano());
					}
				}
			}
			else if (jediAtaca == false) {
				if (acao == 0) { //Jedi tentara se defender
					if (poderSith[hab].getPrioridade() == 1) { //Ataques com sabre tem prioridade 1 (Jedi esquiva)
						System.out.println(jedi.getNome() + "(" + jedi.getVida() + ") esquiva!");
					}
					else { //Jedi tentou se esquivar de ataque com forca (nao tem efeito)
						jedi.setVida(jedi.getVida() - poderSith[hab].getDano()); //Jedi sofre o dano do golpe do Sith
						if (jedi.getVida() < 0)
							jedi.setVida(0);
						System.out.println(jedi.getNome() + "(" + jedi.getVida() + ") leva dano de " + poderSith[hab].getDano());
					}
				}
				else { //Jedi tentara contra-atacar
					System.out.println(jedi.getNome() + "(" + jedi.getVida() + ") contra-ataca com " + poderJedi[hab].getNome());
					//Sofre dano quem tiver menor prioridade
					if (poderSith[hab].getPrioridade() > poderJedi[hab].getPrioridade()) {
						jedi.setVida(jedi.getVida() - poderSith[hab].getDano()); //Jedi sofre o dano do golpe do Sith
						if (jedi.getVida() < 0)
							jedi.setVida(0);
						System.out.println(jedi.getNome() + "(" + jedi.getVida() + ") leva dano de " + poderSith[hab].getDano());
					}
					else {
						sith.setVida(sith.getVida() - poderJedi[hab].getDano()); //Sith sofre o dano do contra golpe do Jedi
						if (sith.getVida() < 0)
							sith.setVida(0);
						System.out.println(sith.getNovoNome() + "(" + sith.getVida() + ") leva dano de " + poderJedi[hab].getDano());
					}	
				}
			}
			
			if (jedi.getVida() <= 0) {
				jedi.setVida(0);
				System.out.println("----------------------");
				System.out.println();
				System.out.println(sith.getNovoNome() + "("+ sith.getVida() + ") venceu!");
				break;
			}
			if (sith.getVida() <= 0) {
				sith.setVida(0);
				System.out.println("----------------------");
				System.out.println();
				System.out.println(jedi.getNome() + "("+ jedi.getVida() + ") venceu!");
				break;
			}
			
		} //fim do while
	} //fim da classe Batalha
	
	public static void main(String[] args) {
		Jedi jedi = new Jedi();
		Sith sith = new Sith();
		

		jedi = montaJedi("Java Skywalker", "Humano", "Masculino", 1.7, "45 ABY");
		sith = montaSith("C Dookan", "Lord Python", "Humano", "Masculino", 1.85, "71 ABY");
		
		luta(jedi, sith);

			
	}
}