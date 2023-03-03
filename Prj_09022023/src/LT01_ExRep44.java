import javax.swing.JOptionPane;
/*
    programador: Renan Gama
    Data criação: 02/03/2023
    versão 01
 */
public class LT01_ExRep44 {
    public static void main(String[] args){
        int base, expoente, potencia, contador;
        contador = 1;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente"));
        
        potencia = base;
        
        while(contador < expoente){
            potencia *= base;
            contador++;
        } 
        
        
        System.out.printf("%s elevado a %s é igual a %s ", base, expoente,potencia);
    }
}
