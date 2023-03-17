
import java.util.Scanner;


/**
 *
 * @author Renan
 */
public class Rec_Ex02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite numero");
        int numero = ler.nextInt();
        
        System.out.print(calcularSerie(numero));
        
    }
    
    static int calcularSerie(int numero){
        int serie;
        int sequencia = 0; 
        if(numero != sequencia ){
            serie =  (calcularSerie(numero - 1) - sequencia);
            sequencia++;
            return serie;
        }else{
            return 0;
        }
    }
}
