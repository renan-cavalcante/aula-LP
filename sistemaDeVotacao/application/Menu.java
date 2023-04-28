package application;

import entity.Eleitor;
import service.EleitorService;
import service.EntradaDeDados;
import service.VotacaoService;

public class Menu {
	public static void main(String[]args) {
		//Menu menu;
		int opcao;
		Eleitor[] eleitores = new Eleitor[10];
		
		
		
		System.out.println("---------------------------");
		System.out.println("      MENU PRINCIPAL");
		System.out.println("---------------------------\n");
		System.out.println("1 - Cadastrar elitor"
						+ "2 - Cadastrar votação 1 e 2"
						+ "3 - Agrupar apuração"
						+ "4 - Menu estatística"
						+ "9 - Fim");
		
		
		opcao = EntradaDeDados.inteiro("Digite a opção desejada: ");
		
		//menu = opcao;
		switch (opcao) {
			case 1:
				eleitores = EleitorService.cadastrarEleitor(eleitores);
				break;
			case 2:
				
				
		}
		
	}
	
	public static void cadastroVotacao() {
		int salaVotacao = VotacaoService.escolherSala();
	}

	
}
