package application;

import java.util.Scanner;

import service.EleitorService;
import service.EntradaDeDados;
import service.VotacaoService;
import service.candidatoService;
import teste.Teste;

public class Menu {
	private static Scanner ler = new Scanner(System.in);
	public static void main(String[]args) {
		
		//Menu menu;
		int opcao;
		
		//menu = opcao;
		
		
		
		do {
			
			System.out.println("---------------------------");
			System.out.println("      MENU PRINCIPAL");
			System.out.println("---------------------------\n");
			System.out.println("1 - Cadastrar elitor\n"
							+ "2 - Cadastrar vota��o 1 e 2\n"
							+ "3 - Agrupar apura��o\n"
							+ "4 - Menu estat�stica\n"
							+ "9 - Fim\n");
			
			System.out.println("Digite a op��o desejada: "); 
			opcao = ler.nextInt();
			
			switch (opcao) {
			case 0:
				//Teste.cadastrarCandidato();
				//candidatoService.cadastrarCandidato();
				candidatoService.testCadastrarCandidato();
				break;
			case 1:
				//Teste.cadastrarEleitor();
				//EleitorService.cadastrarEleitor();
				EleitorService.testeCadastrarEleitor();
				break;
			case 2:
				//VotacaoService.escolherSala();
				VotacaoService.testeCadastrarVotacao();
				break;
				
			case 3:
				VotacaoService.agruparApuracao();
				break;
			case 4:
				menuEstatisticas();
				break;
			default: 
				System.out.println("Opçaõ invalida");
			}
		
		}while(opcao != 9);
		
	}
	
	public static void menuEstatisticas() {
		int opcao;
		do {
			System.out.println("......................................................       \r\n"
					+ ".    MENU ESTATÍSTICA                  .       \r\n"
					+ "......................................................       \r\n"
					+ ". 1 - Vencedor                                    .                                \r\n"
					+ ". 2 - Segundo colocado                         .        \r\n"
					+ "  3 - Quantidade de votos em branco                  .       \r\n"
					+ ". 4 - Quantidade de votos nulos                      .       \r\n"
					+ ". 5 - Mostra eleitores                               .\r\n"
					+ ". 6 - Mostra apuração                               .\r\n"
					+ ". 9 - FIM                                            \r\n"
					+ "");
			opcao = EntradaDeDados.inteiro("Digite a op��o desejada: ");
			
			switch (opcao) {
				case 1:
				case 2:
				case 3:
				case 4:
						
					VotacaoService.exibirResultados(opcao-1);
					break;
					
				case 5: 
					VotacaoService.exibirEleitores();
					break;
				case 6:
					VotacaoService.exibirApuracao();
					break;
				default:
					System.out.println("Opção invalida");
				
			}
			
		}while(opcao != 9);
	}

}
