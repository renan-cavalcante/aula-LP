package listalp;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 09/02/2023
    versão 01
 */


public class Exemplo01a {
    public static void main (String arqs[]){
        int A, B, C;
         A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
         B = Integer.parseInt(JOptionPane.showInputDialog("Digite O valor de B:"));
         C = (A+B);
         
         JOptionPane.showMessageDialog(null,"O valor de C é: " + C);
    }
}
