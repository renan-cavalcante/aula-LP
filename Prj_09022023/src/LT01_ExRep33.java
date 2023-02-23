import javax.swing.JOptionPane;
/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep33 {
    public static void main(String arqs[]){
        int num;
        double serie, indice;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        serie = 1;
        
        
        for(indice = 2; indice <= num; indice++){
            serie = serie + (1/indice);
        }
        
        JOptionPane.showMessageDialog(null,"O resultado da série é "+serie);
             
    }
}
