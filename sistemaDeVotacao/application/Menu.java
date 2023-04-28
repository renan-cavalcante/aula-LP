package application;

import service.EleitorService;
import service.EntradaDeDados;
import service.VotacaoService;

public class Menu {
	public static void main(String[]args) {
		//Menu menu;
		int opcao;
		
		
		
		
		System.out.println("---------------------------");
		System.out.println("      MENU PRINCIPAL");
		System.out.println("---------------------------\n");
		System.out.println("1 - Cadastrar elitor"
						+ "2 - Cadastrar votação 1 e 2"
						+ "3 - Agrupar apuração"
						+ "4 - Menu estatística"
						+ "9 - Fim");
		
		int a = (int) Math.random();
		
		System.out.println(a);
		opcao = EntradaDeDados.inteiro("Digite a opção desejada: ");
		
		//menu = opcao;
		switch (opcao) {
			case 1:
				EleitorService.cadastrarEleitor();
				break;
			case 2:
				VotacaoService.escolherSala();
				break;
				
		}
		
	}
	

	
}
