/*
    @author: Renan Gama
    Data criação: 07/03/2023
    versão 01
 */
import java.util.Scanner;

public class LT02_ExMod20 {
    public static void main(String[] args){
        double A, B, C;
        
        A = lerValor("A");
        B = lerValor("B");
        C = lerValor("C");
        
        calcularDelta(A, B, C);
        
    }
    
    static int lerValor(String parametro){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o valor de %s", parametro);
        
        return  ler.nextInt();
        
    }
    
    static void calcularDelta(double A, double B, double C){
        double delta, X1, X2;
        
        delta = (B*B)-(4*A*C);
        
        if(verificarRaizes(delta)){
            X1 = (-B + Math.sqrt(delta))/(2*A);
            X2 = (-B - Math.sqrt(delta))/(2*A);
            
            System.out.println("X1: "+ X1 +" X2: "+ X2);
            
        }else{
            System.out.println("Não existem Raizes reais");
        }
        
    }
    
    static boolean verificarRaizes(double delta){
                   
            return delta >= 0;
        
    }
}
