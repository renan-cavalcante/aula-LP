package lote2;

import javax.swing.JOptionPane;

/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT02_ExMod16V2 {
    public static void main(String [] args){
        
    double QuantHoras, ValorHora, PercDesconto; // variaveis locais, so podem ser manipuladas dentro do public static
    int descendentes;
                
        QuantHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        ValorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada"));
        descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de descendentes"));
        PercDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto "));
        
        CalcularSalarios(  QuantHoras, ValorHora, PercDesconto, descendentes); // enviar os valores das variaveis para a procedure
       
    }
    
static void CalcularSalarios(double quantHoras,double ValorHora,double PercDesconto,int descendentes ){ /*variaveis locais tambem, tem o mesmo 
        nome das que enviaram o valor, mas são variaveis diferentes, poderiam ter nomes diferentes das anteriores
        
        */
        double SalarioBruto, SalarioLiq, Salario;
        SalarioBruto = quantHoras * ValorHora;
        SalarioLiq = SalarioBruto * (1-(PercDesconto/100));
        Salario = SalarioLiq + (descendentes * 100);
    
        System.out.printf("O valor do salario é %s", Salario);
    }
}
