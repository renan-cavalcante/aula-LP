
import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class LT03_ExVet03 {
    public static void main(String[] args){
        int[] vetor1 , vetor2 , vetor3;
        vetor1 = new int[3];
        vetor2 = new int[3];
        vetor3 = new int[6];
        
        receberValores(vetor1);
        receberValores(vetor2);
        vetor3 = concatenarVetores(vetor1, vetor2);
        
        exibirVetor(vetor3);       
    }
    
    public static int[] receberValores(int[] vetor){
        int cont = 0;
        Scanner ler = new Scanner(System.in);
        
        for(int elemento : vetor){
            vetor[cont] = ler.nextInt(); 
            cont++;
        }
        
        
        return vetor;
        
    }
    
    public static int[] concatenarVetores(int[] vetor1, int[] vetor2){
        int[] vetorcon = new int[6];
        for(int i = 0; i < 3; i++){
            vetorcon[i] = vetor1[i];
            vetorcon[i+3] = vetor2[i];
        }
        return vetorcon;
    }
    
    public static void exibirVetor(int[] vetor){
        for( int elemento : vetor){
            System.out.println(elemento);
        }
    }
}
