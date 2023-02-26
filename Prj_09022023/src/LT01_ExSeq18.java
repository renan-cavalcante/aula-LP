import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */
public class LT01_ExSeq18 {
    public static void main(String arqs[]){
        int valor1, valor2, diferenca;
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        
        if(valor1 > valor2){
            diferenca = valor1 - valor2;
            
        }
        else{
            diferenca = valor2 - valor1;
        }
        
        System.out.println("A Diferenca entre os dois valores é " + diferenca);
                
    }
}
