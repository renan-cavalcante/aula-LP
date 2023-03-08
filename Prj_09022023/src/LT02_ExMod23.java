/*
    @author: Renan Gama
    Data criação: 08/03/2023
    versão 01
 */
import java.util.Scanner;

public class LT02_ExMod23 {
    static int[] valores = new int[4];
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args){
        receberValores();
        ordenarValores();
        
    }
    
    static void receberValores(){
        int i;
        String texto = "1";
        
        System.out.printf("Digite 3 numero em ordem crescente %n");
        for (i = 0; i < 3; i++){
            System.out.printf("%n%s numero ", texto);
            valores[i] = ler.nextInt();
            if(i > 0){
                texto =  i+2+"";
                if(valores[i] <= valores[i-1]){
                    texto = "Numero menor que o anterior, digite um novo";
                    i--;
                }
                
            }else{
                texto =  i+2+"";
            }
            
        }
        System.out.printf("Digite um numero aleatorio: ");
        valores[i] = ler.nextInt();
    }
    
    static void ordenarValores(){
        int auxiliarTroca;
        for( int i = 0; i < 3; i++){
            if(valores[3] < valores[i]){
                for(int j = 3 ; j > i; j--){
                    auxiliarTroca = valores[j];
                    valores[j] = valores[j-1];
                    valores[j-1] = auxiliarTroca;
                }
            }
        }
        
        System.out.printf("Numero ordenados:");
        
        for(int valor : valores){
            System.out.printf("%s, ", valor);
        }
    }
}
