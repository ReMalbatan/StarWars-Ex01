package ex02;
import ex01.*;

public class SimuladorDeBatalha {
	public static void main(String[] args) {
		Jedi jedi = new Jedi();
		Sith sith = new Sith();
		
		jedi = Batalha.montaJedi("Java Skywalker", "Humano", "Masculino", 1.7, "45 ABY", 10, 10);
		sith = Batalha.montaSith("C Dookan", "Lord Python", "Humano", "Masculino", 1.85, "71 ABY", 10, 10);
		
		Batalha.luta(jedi, sith);	
	}
}