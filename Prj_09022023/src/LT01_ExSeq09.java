import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 15/02/2023
    versão 01
 */
public class LT01_ExSeq09 {
    public static void main(String arqs[]){
        int Num1, Num2, SomaQuadrados;
        
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º numero: "));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2° numero"));
        
        SomaQuadrados = ((Num1 * Num1) + (Num2 * Num2));
        
        JOptionPane.showMessageDialog(null,"A soma dos quadrados de "+ Num1 +" e " + Num2 + " é: " + SomaQuadrados);
    }
}
