
import javax.swing.JOptionPane;

/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT02_ExMod16 {
    static double QuantHoras, ValorHora, PercDesconto, SalarioBruto, SalarioLiq, Salario; /* variaveis globais
    podem ser manipuladas em qualquer lugar do programa
    */
    static int descendentes;
    public static void main(String [] args){
                
        ReceberValores();
        CalcularSalarios();
        ImprimirSalario(Salario);
        
        
    }
    
    static void ReceberValores(){
        QuantHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        ValorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada"));
        descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de descendentes"));
        PercDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto "));
    }
    
    static void CalcularSalarios(){
        SalarioBruto = QuantHoras * ValorHora;
        SalarioLiq = SalarioBruto * (1-(PercDesconto/100));
        Salario = SalarioLiq + (descendentes * 100);
    }
    
    static void ImprimirSalario( double salario){
        System.out.printf("O valor do salario é %s", salario);
    }
}
