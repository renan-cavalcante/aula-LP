import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 15/02/2023
    versão 01
 */
public class LT01_ExSeq08 {
    public static void main (String arqs[]){
        double Deposito, ValorAtual;
        
        Deposito = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor do deposito: "));
        
        ValorAtual = (Deposito * 1.013);
        
        JOptionPane.showMessageDialog(null,"O valor com acrescimo de 1,3% após 1 mês será de :" + ValorAtual);
    }
    
}
