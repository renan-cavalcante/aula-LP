import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */

public class LT01_ExDec23 {
    public static void main(String arqs[]){
        int Valor1, Valor2, Valor3, Valor4;
        
        Valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° valor"));
        Valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor"));
        Valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° valor"));
        Valor4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4° valor"));
        
        if(Valor4 < Valor1){
            System.out.println(Valor4+","+Valor1+","+Valor2+","+Valor3);
        }else if(Valor4 < Valor2){
            System.out.println(Valor1+","+Valor4+","+Valor2+","+Valor3);
        }else if(Valor4 < Valor3){
            System.out.println(Valor1+","+Valor2+","+Valor4+","+Valor3);
        }else{
            System.out.println(Valor1+","+Valor2+","+Valor3+","+Valor4);
        }
    }
}
