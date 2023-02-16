import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 15/02/2023
    versão 01
 */
public class LT01_ExSeq07 {
    public static void main(String arqs[]){
        int Comprimento, Altura, Largura, Volume;
        Comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o Comprimento do paralelepipedo"));
        Altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura do paralelepipedo"));
        Largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a Largura do Paralelepipedo "));
        
        Volume = (Altura * Largura * Comprimento);
        
        JOptionPane.showMessageDialog(null,"O Volume do paralelepipedo é: " + Volume);
    }
}
