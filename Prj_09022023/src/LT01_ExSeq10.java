import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 15/02/2023
    versão 01
 */
public class LT01_ExSeq10 {
    public static void main(String arqs[]){
        double Num1, Num2, Diferenca;
        
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1° numero: "));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2° numero: "));
        
        Diferenca = Num1 - Num2;
        
        JOptionPane.showMessageDialog(null,"A diferença entre os dois numeros é: " + Diferenca);
    }
}
