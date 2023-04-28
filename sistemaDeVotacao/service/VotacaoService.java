package service;

import entity.Votacao;

public class VotacaoService {
	
	private static Votacao[] votacao = new Votacao[2];
	private static int [][] secaoValidas = {{01, 02, 05},{ 20, 30, 50}};
	
	public static void cadastrarVotacao(int i) {
		Integer numeroEleitor  = EntradaDeDados.inteiro("Digite seu numero de eleitor: ");
		Integer secao = EleitorService.secaoDoEleitor(numeroEleitor);
		
		for(int j = 0; i < 3; i++) {
			if(i == 1) {
				
				if(secaoValidas[0][j] == secao) {
					
					Integer codCandidato  = EntradaDeDados.inteiro("Digite o codigo do seu candidato: ");
					votacao[i] = new Votacao(secao, codCandidato, numeroEleitor);
					
				}else {
					System.out.println("Seção invalida");
				}
				
			}else {
				if(secaoValidas[1][j] == secao) {
					Integer codCandidato  = EntradaDeDados.inteiro("Digite o codigo do seu candidato: ");
					
					votacao[i] = new Votacao(secao, codCandidato, numeroEleitor);
					
				}else {
					System.out.println("Seção invalida");
				}
			}
		}	
		
	}
	
	
	public static void escolherSala() {
		boolean continuar;
		do{
			continuar = false;
			int sala = EntradaDeDados.inteiro("Digite 1 - para sala 1 ou 2 - para sala 2");
			switch (sala) {
			case 1:
				cadastrarVotacao(1);
				break;
			case 2:
				cadastrarVotacao(2);
				break;
			default:
					System.out.println("Opção invalida");
					continuar = true;
				
			}
		}while(continuar);
		
	}
	
	
	
}
