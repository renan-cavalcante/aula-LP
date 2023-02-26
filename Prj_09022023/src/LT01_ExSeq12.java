import javax.swing.JOptionPane;
/*
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */
public class LT01_ExSeq12 {
    public static void main(String arqs[]){
        int AnoNasc, AnoAtual, Idade, Idade17;
        
        AnoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento: "));
        AnoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual "));
        
        Idade = AnoAtual - AnoNasc;
        Idade17 = Idade + 17;
        
        JOptionPane.showMessageDialog(null,"A sua idade é " + Idade + "anos, e daqui 17 anos você terá "+ Idade17+"Anos");
    }
}
