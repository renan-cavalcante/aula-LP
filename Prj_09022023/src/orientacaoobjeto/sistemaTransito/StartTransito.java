package orientacaoobjeto.sistemaTransito;

import java.util.Scanner;

public class StartTransito {
    public static void main(String[]args){
        try (Scanner ler = new Scanner(System.in)) {
			ServerEstatistica server = new ServerEstatistica();
			int opcao;
			boolean continuar = true;
			Estatistica[] estatisticas = new Estatistica[10];
			
				
			do{
			    System.out.println("Digite a opção desejada:");
			    System.out.println("	MENU ESTATÍSTICA	               	|\n" +
			    "| Estatísticas de acidentes em 2020		|\n" +
			    "| 1 - Cadastro Estatística			|\n" +
			    "| 2 - Consulta por quantidade de acidentes	|\n" +
			    "| 3 - Consulta por estatísticas de acidentes	|\n" +
			    "| 4 - Acidentes acima da média das 10 cidades   |\n" +
			    "| 9 - Finaliza ");
			    opcao = ler.nextInt();
			    switch (opcao){
			    case 1:
			        server.cadastrarEstatisticas(estatisticas);
			        break;
			    case 2:
			        server.consultarPorQntdAcidentes(estatisticas);
			        break;
			    case 3:
			        server.consultarMaisMenosAcidentes(estatisticas);
			        break;
			    case 4:
			        server.cidadesAcimaDaMedia(estatisticas);
			        break;
			    case 9:
			        System.out.println("Sistema finalizado");
			        continuar = false;
			        break;
			    default:
			        System.out.println("Opção invalida");
			     
			        
			    }
			}while(continuar);
		}
        
    }
}
