/*
    @author: Renan Gama
    Data criação: 07/03/2023
    versão 01
 */
import java.util.Scanner;

public class LT02_ExMod19 {
    static double valor1, valor2;
    static Scanner ler = new Scanner(System.in);            
    
    public static void main(String[] args){
        lerValores();
        
        System.out.printf("O maior valor é %s",verificarMaior(valor1, valor2));
    }
    
    static void lerValores(){
        System.out.println("o 1° valor:");
        valor1 = ler.nextDouble();
        
        System.out.println("o 2° valor:");
        valor2 = ler.nextDouble();        
        
    }

    static double verificarMaior(double valor1, double valor2) {
        if(valor1 > valor2){
            return valor1;
            
        }else{
            return valor2;
        }
    }
    
    
}
