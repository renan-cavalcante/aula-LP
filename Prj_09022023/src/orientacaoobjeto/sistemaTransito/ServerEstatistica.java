package orientacaoobjeto.sistemaTransito;

import java.util.Scanner;


public class ServerEstatistica {
    public Estatistica[] cadastrarEstatisticas(Estatistica[] estatistica){
        
        try (Scanner ler = new Scanner(System.in)) {
			for(int i =0; i < 10; i++){
			    System.out.println("Digite o codigo da cidade:");
			    int codigoCidade = ler.nextInt();
			    System.out.println("Digite o nome da cidade:");
			    String nomeCidade = ler.next();
			    System.out.println("Digite a quantidade de acidentes:");
			    int qntdAcidentes = ler.nextInt();
			    
			    estatistica[i] = new Estatistica(codigoCidade, nomeCidade, qntdAcidentes); 
			    
			}
		}
        return estatistica;
    }
    
    public void consultarPorQntdAcidentes(Estatistica[] estatisticas){
        /*
        for(int i = 0; i < 10; i++){
            estatistica[i].QtdAcidentes;
        }
        */
        for(Estatistica estatistica : estatisticas){
            if( estatistica.QtdAcidentes > 100 && estatistica.QtdAcidentes < 500 ){
                System.out.printf("Codigo: %s\n Nome: %s\n quantidade de acidentes: %s\n\n",estatistica.codigoCidade, estatistica.NomeCidade, estatistica.QtdAcidentes);
            }
        }
    }
    
    public void consultarMaisMenosAcidentes(Estatistica[] estatisticas){
        Estatistica maior = estatisticas[1];
        Estatistica menor = estatisticas[1];
        
        for(Estatistica estatistica : estatisticas){
            if(estatistica.QtdAcidentes > maior.QtdAcidentes){
                maior = estatistica;
            }
            if(estatistica.QtdAcidentes < menor.QtdAcidentes){
                menor = estatistica;
            }
        }
        System.out.printf("A cidade com maior numeros de acidentes é %s com %s acidentes\n", maior.NomeCidade, maior.QtdAcidentes);
        System.out.printf("A cidade com menor numeros de acidentes é %s com %s acidentes\n", menor.NomeCidade, menor.QtdAcidentes);
    }
    
    public void cidadesAcimaDaMedia(Estatistica[] estatistica){
        int media = 0;
        for(Estatistica indice : estatistica){
            media += indice.QtdAcidentes;
        }
        
        media /=10;
          
        for(Estatistica indice : estatistica){
            if(indice.QtdAcidentes > media){
                System.out.printf("Codigo: %s\n Nome: %s\n quantidade de acidentes: %s\n\n",indice.codigoCidade, indice.NomeCidade, indice.QtdAcidentes);
            }
        }
    }
}