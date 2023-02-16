import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 15/02/2023
    versão 01
 */
public class LT01_ExSeq05 {
    public static void main(String arqs[]){
        double A,B,C,Delta,X1,X2;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
        
        Delta = ((B*B)-(4*A*C));
        X1 = ((-B) + (Math.sqrt(Delta)))/(2*A);
        X2 = ((-B) - (Math.sqrt(Delta)))/(2*A);
        
        JOptionPane.showMessageDialog(null,"O valor de X1 é: " +X1+", e o valor de X2 é: "+X2);
    }
}
