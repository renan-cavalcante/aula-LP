package lote1;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */

public class LT01_ExDec20 {
    public static void main(String arqs[]){
        double A, B, C, delta, X1, X2;
        
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite  o valor de A"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite  o valor de B"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite  o valor de C"));
        
        delta = (B*B)-(4*A*C);
        
        if(delta >= 0){
            X1 = (-B + Math.sqrt(delta))/(2*A);
            X2 = (-B - Math.sqrt(delta))/(2*A);
            
            System.out.println("X1: "+ X1 +" X2: "+ X2);
        }else{
            System.out.println("Não existem Raizes reais");
        }
    }
}
