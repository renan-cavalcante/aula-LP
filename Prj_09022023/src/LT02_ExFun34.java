import javax.swing.JOptionPane;

/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun34 {
    public static void main(String arqs[]){
        int numero, indice;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        System.out.println("Tabuada do "+numero);
         
        for( indice = 1; indice <= 10; indice++){
            System.out.println(numero+"X"+indice+"="+calcularTabuada(numero, indice));
        }
        
    }
    
    static int calcularTabuada(int numero, int indice){
        return numero*indice;
        
    }
}
