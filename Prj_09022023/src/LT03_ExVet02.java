
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renan
 */
public class LT03_ExVet02 {
    static int numeros[] = new int[10];
    public static void main(String[] args){
       receberValores();
        verificarMaiorMenor();
        verificarMedia();
           for(int numero : numeros){
          
            System.out.println(numero);
        }
    }
    
    public static void receberValores(){
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        for( int numero : numeros){
            System.out.println(cont+1+"°");
            numeros[cont] = ler.nextInt();
            cont++;
        }
    }
    
    public static void verificarMaiorMenor(){
        int maior = numeros[0];
        int menor = numeros[0];
        
        for(int numero : numeros){
            if( numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }
        System.out.printf("O maior numero é o %s e o menor é %s", maior, menor);
    }
    
    public static void verificarMedia(){
        double media = 0;
        int cont = 0;
        for(int numero: numeros){
            media += numero;
            cont++;
        }
        System.out.printf("A media é"+ media/cont);
    }
        
}
