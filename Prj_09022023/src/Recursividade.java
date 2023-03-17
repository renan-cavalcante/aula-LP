
/**
 *
 * @author FATEC ZONA LESTE
 */

import java.util.Scanner;

public class Recursividade {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int numero = ler.nextInt();
        
        System.out.print(fatorar(numero));
        
    }
    
    static int fatorar(int numero){
        int fatorial;
        
        if(numero > 1){
            fatorial = numero * fatorar(numero - 1);
            return fatorial;
        }else{
            return 1;
        }
    }
           
}
