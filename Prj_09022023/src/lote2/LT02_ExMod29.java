package lote2;
import javax.swing.JOptionPane;

/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExMod29 {
     public static void main(String[] args){
        int TipoInvestimento;
        double valor;
        
        TipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do investimento: 1- Poupança e 2 Renda fixa"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento "));
        
        JOptionPane.showMessageDialog(null,"O valor após 1 mês é de R$"+ calcularRendimento(valor, TipoInvestimento));
    }
    static double calcularRendimento(double valor, int TipoInvestimento){
        double  ValorAtual;
        
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
        return ValorAtual;
    }
}
