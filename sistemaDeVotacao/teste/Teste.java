package teste;

import entity.Candidato;
import entity.Eleitor;

public class Teste {
	private static Candidato[] candidatos = new Candidato[3];
	private static Eleitor[] eleitores = new Eleitor[20];
	
	public static void cadastrarCandidato() {
		candidatos[0] = new Candidato("Branco", 0);
		candidatos[1] = new Candidato("Maria", 1);
		candidatos[2] = new Candidato("João", 2);
		
		System.out.println("Candidatos cadastrados");
		
	}
	
	public static void cadastrarEleitor() {
	
			eleitores[0] = new Eleitor(123, "eleitor1", 1);
			eleitores[1] = new Eleitor(124, "eleitor2", 2);
			eleitores[2] = new Eleitor(125, "eleitor3", 5);
			eleitores[3] = new Eleitor(126, "eleitor4", 20);
			eleitores[4] = new Eleitor(127, "eleitor5", 30);
			eleitores[5] = new Eleitor(128, "eleitor6", 50);
			eleitores[6] = new Eleitor(129, "eleitor7", 1);
			eleitores[7] = new Eleitor(130, "eleitor8", 2);
			eleitores[8] = new Eleitor(131, "eleitor9", 5);
			eleitores[9] = new Eleitor(100, "eleitor00", 6);
			eleitores[10] = new Eleitor(133, "eleitor10", 20);
			eleitores[11] = new Eleitor(134, "eleitor11", 30);
			eleitores[12] = new Eleitor(135, "eleitor12", 50);
			eleitores[13] = new Eleitor(136, "eleitor13", 1);
			
			System.out.println("Eleitores cadastrado");
	

	}
	
}
