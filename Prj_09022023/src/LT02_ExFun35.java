import javax.swing.JOptionPane;

/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun35 {
    static  int Numero1, Numero2;
    public static void main(String arqs[]){
        
        
        Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        
        
        
        System.out.println("A soma dos impares entre "+Numero1+" e "+Numero2+" é " + somarImpar());
    } 
    
    static int somarImpar(){
        int indice, somaImpar;
        somaImpar = 0;
        indice = Numero1 + 1;
        while(indice < Numero2){
            if (indice % 2 == 1){
                somaImpar = somaImpar + indice;
            }
            indice++;
        }
        return somaImpar;
    }
            
    
    static void verificarMaior(){
        int aux;
        
        if(Numero2 < Numero1){
            aux = Numero1;
            Numero1 = Numero2;
            Numero2 = aux;
        }
    }
}
