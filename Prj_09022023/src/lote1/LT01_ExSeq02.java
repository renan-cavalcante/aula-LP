package lote1;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 09/02/2023
    versão 01
 */
public class LT01_ExSeq02 {
    public static void main(String arqs[]){
        double Salario, NovoSalario;
        
       Salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do seu Salrio:"));
       
       NovoSalario = (Salario*1.15);
       
       JOptionPane.showMessageDialog(null,"Seu salario, com aumento de 15% é: " +NovoSalario);
    }
    
    
}
