package lote1;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */

public class LT01_ExDec26 {
    public static void main(String arqs[]){
        int Num1, Num2;
        
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero"));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor"));
        
        if( Num2 > Num1){
            if(Num2 % Num1 == 0){
                System.out.println(Num2 +" é múltipo de "+ Num1);
            }else{
                System.out.println(Num2 +" Não é múltipo de "+ Num1);
            }
        }else if(Num2 < Num1){
            if(Num1 % Num2 == 0){
                 System.out.println(Num1 +" é múltipo de "+ Num2);
            }else{
                System.out.println(Num1 +" Não é múltipo de "+ Num2);
            }
        }else {
            System.out.println(Num1+" e "+ Num2 +" são iguais ");
        }             
    }    
}

