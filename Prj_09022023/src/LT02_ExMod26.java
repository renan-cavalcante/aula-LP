/*
    @author: Renan Gama
    Data criação: 08/03/2023
    versão 01
 */
import javax.swing.JOptionPane;

public class LT02_ExMod26 {
    public static void main(String arqs[]){
        int Num1, Num2;
        
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero"));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor"));
        verificarMaior(Num1, Num2);
                   
    }  
    
    static void verificarMaior(int Num1, int Num2){
        if( Num2 > Num1){
            boolean divisor = (Num2 % Num1) == 0;
            verificarDivisor(divisor, Num2, Num1);
        }else if(Num2 < Num1){
            boolean divisor = (Num1 % Num2) == 0;
            verificarDivisor(divisor, Num1, Num2);
        }else {
            System.out.println(Num1+" e "+ Num2 +" são iguais ");
        }  
    }
    
    static void verificarDivisor(boolean divisor, int valor1, int valor2){
        if(divisor){
            System.out.println(valor1 + " é múltipo de " + valor2);
        }else{
            System.out.println(valor1 + " Não é múltipo de " + valor2);
        }
    }
}
