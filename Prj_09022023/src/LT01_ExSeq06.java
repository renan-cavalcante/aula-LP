import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 15/02/2023
    versão 01
 */
public class LT01_ExSeq06 {
    public static void main(String arqs[]){
        int X, Y, Aux;
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
        
        Aux = X;
        X = Y;
        Y = Aux;
        
        JOptionPane.showMessageDialog(null,"O valor trocado é X:" + X + " e Y: " + Y );
    }
}
