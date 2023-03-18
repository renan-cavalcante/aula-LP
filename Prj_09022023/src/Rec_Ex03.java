
import java.util.Scanner;

/**
 *
 * @author Renan
 */

public class Rec_Ex03 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double numero = ler.nextDouble();
        System.out.print(calcularSerie(numero));
    }
    
    static double calcularSerie(double numero){
        double serie = 0;
        if(numero != 1){
            serie +=  1/numero+(calcularSerie(numero - 1));
            System.out.println(serie);
            System.out.println(1/numero);
            return serie;
        }else{
            return 1;
        }
        
    }
}
