package lote3;

import java.util.Scanner;


/**
 *
 * @author Renan
 */
public class LT03_ExVet01 {
    public static void main(String[] args){
        int numeros[] = new int[50];
        for( int i = 0; i < 5; i++){
            numeros[i] = receberValores();
        }
        
        System.out.printf("A media dos numeros entre 10 e 200 é: %.2f, e a soma do impares é %s",calcularMedia(numeros), somarImpar(numeros));
        
        
    }
    
    public static int receberValores(){
        try (Scanner ler = new Scanner(System.in)) {
			return ler.nextInt();
		}
        
    }
    
    public static double calcularMedia(int numeros[]){
        double media = 0;
        int contador = 0;
        for(int numero : numeros){
            if(numero > 9 && numero < 201){
                media+= numero;
                contador++;
            }
        }
        return media / contador;
    }
    
    public static int somarImpar(int numeros[]){
        int somaImpares= 0;
        for(int numero : numeros){
            if(numero % 2 != 0){
                somaImpares+= numero;
            }
            
        }
        return somaImpares;
    }
    
}
