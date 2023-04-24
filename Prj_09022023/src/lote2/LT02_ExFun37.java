package lote2;
import javax.swing.JOptionPane;

/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun37 {
    public static void main(String arqs[]){
        int numero, indice;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        indice = 1;
        
        System.out.print(" 0,");
        while(indice < numero){
            
            System.out.print( calcularFibonacci(indice)+", ");
            indice++;
        }
    }
    
    static int calcularFibonacci(int n){
        int F1 = 0;
        int F2 = 0;
        
        for (int i = 1; i<= n; i++){
            if ( i == 1){
                F2 = 1;
                F1 = 0;
                
            }else {
                F2 += F1;
                F1 = F2 - F1;
            }
        }
        return F2;
    }
}
