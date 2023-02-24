import javax.swing.JOptionPane;
/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep36 {
    public static void main(String arqs[]){
        double numero, indice, serie,fatorial;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        serie = 1;
        indice = 1;
        fatorial = 1;
        
        while(indice <= numero){
            fatorial = fatorial*indice;
            serie = serie + (1/fatorial);
            indice++;
        }
        
        System.out.println("O resultado da série é "+serie);
    }
}
