package lote1;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */

public class LT01_ExDec24 {
    public static void main(String arqs[]){
        int Num;
        
        Num = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° valor"));
        
        if(Num % 2 == 0 ){
            if(Num %3 == 0){
                System.out.println(Num+" é divisivel por 2 e 3");
            }else{
                System.out.println(Num+" é divisivel apenas por 2");
            }
        }else if(Num % 3 == 0){
            System.out.println(Num+" é divisivel apenas por 3");
        }else {
            System.out.println(Num+" Não é divisivel por 2 nem 3");
        }
    }
}
