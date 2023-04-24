package lote1;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */
public class LT01_ExSeq16 {
    public static void main(String arqs[]){
        double QuantHoras, ValorHora, PercDesconto, SalarioBruto, SalarioLiq, Salario;
        int descendentes;
        
        QuantHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        ValorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada"));
        descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de descendentes"));
        PercDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto "));
        
        SalarioBruto = QuantHoras * ValorHora;
        SalarioLiq = SalarioBruto * (1-(PercDesconto/100));
        Salario = SalarioLiq + (descendentes * 100);
        
        System.out.println("O valor do seu salario é" + Salario);
    }
}
