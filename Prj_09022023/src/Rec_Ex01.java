
import java.util.Scanner;


/**
 *
 * @author Renan
 */
public class Rec_Ex01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite numero");
        int numero = ler.nextInt();
        
        System.out.print(serieRecursivaDiminuindo(numero));
    }
    
    static int serieRecursivaDiminuindo(int numero){
        int serie;
        if(numero > 1){
            serie = numero + serieRecursivaDiminuindo(numero - 1);
            return serie;
        }else{
            return 1;
        }
    } 
}
