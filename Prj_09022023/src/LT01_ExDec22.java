import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */

public class LT01_ExDec22 {
    public static void main(String arqs[]){
        int Valor1, Valor2;
        
        JOptionPane.showMessageDialog(null,"Digite dois valores diferentes");
        
        Valor1 = Integer.parseInt(JOptionPane.showInputDialog("1° valor"));
        Valor2 = Integer.parseInt(JOptionPane.showInputDialog("2° valor"));
        
        System.out.println("Os valores em ordem crescente:");
        
        if (Valor1 > Valor2){
            System.out.println(Valor2+","+ Valor1);
        }else{
            System.out.println(Valor1+"," +Valor2);
        }
    }
}
