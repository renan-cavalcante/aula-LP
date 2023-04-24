package listalp;

import java.util.Scanner;


/**
 *
 * @author Renan
 */
public class Rec_Ex02 {
    public static void main(String[] args){
        try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite numero");
			int numero = ler.nextInt();
			
			System.out.print(calcularSerie(numero));
		}
        
    }
    
    static int calcularSerie(int numero){
        int serie;
        if(numero != 0){
            serie =  numero +calcularSerie(numero - 1) ;
            return serie;
        }else{
            return 0;
        }
    }
}
