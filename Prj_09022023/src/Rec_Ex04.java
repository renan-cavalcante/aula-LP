

import java.util.Scanner;


/**
 *
 * @author Renan
 */
public class Rec_Ex04 {
        public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double numero = ler.nextDouble();
        System.out.print(calcularSerie(numero, numero )); // manda o numero duas vezes
    }
        
    static double calcularSerie(double numero, double contador){ // receber o mesmo numero para variaveis diferente
        double serie = 0;
        double a;
        if(numero !=  1){
            System.out.println(contador);
            a =  calcularSerie(numero -1, contador); // pega o retorno da recursividade
            
              
            contador = (contador+1) - numero; //torna as duas variaveis recebidas inversamente proporcionas
            
            serie =  (contador/numero) + a; // calcula a serie
//forma compacta      // serie =  (((contador+1) - numero)/numero) +calcularSerie(numero -1, contador); 
            System.out.println("a" +contador);
            
            
            return serie;
        }
        else{
            return contador;
        }
    }
}
