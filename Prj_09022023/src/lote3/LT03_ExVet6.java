package lote3;

/**
 *
 * @author Renan
 */
import java.util.Scanner;

public class LT03_ExVet6 {
    public static void main(String[] args){
        try (Scanner ler = new Scanner(System.in)) {
			int[] vetor = new int[5];
			boolean trocouDePosicao;
			
			int aux;
			
			for( int i = 0; i < 5; i++){
			    vetor[i] = ler.nextInt();
			}
			
			do{
			    trocouDePosicao = false;
			    for(int i = 0; i < 4 ; i++){
			        if(vetor[i] > vetor[i + 1]){
			            aux = vetor[i];
			            vetor[i] = vetor[i+1];
			            vetor[i+1] = aux;
			            trocouDePosicao = true;
			       }
			    } 
			}while(trocouDePosicao);
			
			int cont = 0;
			for(int i : vetor){
			    cont++;
			    System.out.printf("%s: (%s)", cont, i);
			}
		}
        
    }
}
