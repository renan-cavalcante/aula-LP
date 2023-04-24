package lote2;
import javax.swing.JOptionPane;

/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun33 {
    static int num;
    public static void main(String arqs[]){
        
       
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        

        JOptionPane.showMessageDialog(null,"O resultado da série é "+ calcularSerie());
             
    }
    
    static double calcularSerie(){
         double serie;
         serie = 1;
        
        for(int indice = 2; indice <= num; indice++){
            serie = serie + (1/(double)indice);
        }
        return serie;
    }
}
