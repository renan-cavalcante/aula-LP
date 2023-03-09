import javax.swing.JOptionPane;

/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */


public class LT02_ExFun32 {
    public static void main(String arqs[]){
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero iteiro"));
        
        System.out.println(calcularFatorial(num));
    }
    
    static int calcularFatorial(int num){
        int indice = num - 1;
        while(indice > 0){
            num = num * indice;
            indice--;
        }
        return num;
    }
}
