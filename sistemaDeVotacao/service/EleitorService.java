package service;

import entity.Eleitor;

public class EleitorService {
	private static Eleitor[] eleitores = new Eleitor[10];
	
	public static void cadastrarEleitor() {
		Integer numeroEleitor;
		String nomeEleitor;
		Integer secao;
		for(int i = 0; i < 10; i++) {
			numeroEleitor = EntradaDeDados.inteiro("Digite o numnero do eleitor: ");
			nomeEleitor = EntradaDeDados.string("Digite o nome do eleitor: ");
			secao = EntradaDeDados.inteiro("Digite a seçaõ do eleitor: ");
			eleitores[i] = new Eleitor(numeroEleitor, nomeEleitor, secao);	
		
		}
	
	}
	
	public static Integer secaoDoEleitor(int numeroEleitor) {
		for(Eleitor eleitor : eleitores) {
			if(eleitor.getNumeroEleitor().equals(numeroEleitor)) {
				return eleitor.getSecao();
			}
		}
		return -1;
	}
}
