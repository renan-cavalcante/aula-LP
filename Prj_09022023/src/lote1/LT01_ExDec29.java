package lote1;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExDec29 {
    public static void main(String arqs[]){
        int TipoInvestimento;
        double valor, ValorAtual;
        
        TipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do investimento: 1- Poupança e 2 Renda fixa"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento "));
        
        switch(TipoInvestimento){
            case 1: 
                ValorAtual = valor * 1.03;
                break;
            case 2: 
                ValorAtual = valor * 1.05;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opçãpo invalida");  
                ValorAtual = valor;
        }
        JOptionPane.showMessageDialog(null,"O valor após 1 mês é de R$"+ValorAtual);
    }
}
