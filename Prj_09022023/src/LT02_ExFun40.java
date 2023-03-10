
import javax.swing.JOptionPane;

/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun40 {
    static int Numero1, Numero2;
     public static void main(String arqs[]){
        int indice, contador;
        
        Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero"));
        Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero"));
        
        
        System.out.println("Os numeros primos entres "+Numero1+" e "+Numero2+ "são: ");
        for(indice = Numero1; indice < Numero2; indice++){
            contador = 0;
            if(verificarPrimos(contador)){
                System.out.println(indice);
            }
            Numero1++;
        }
        
    }
     
    static boolean verificarPrimos(int contador){
        int indice2;
        for(indice2 = Numero1; indice2 > 0; indice2--){             
            if(Numero1 % indice2 == 0){ 
                contador++;
            }
        }
        return contador == 2;
    }
     
    static void verificarMaior(){
        int aux;
        if(Numero1 > Numero2){
            aux = Numero1;
            Numero1 = Numero2;
            Numero2 = aux;
        }
        
    }
}
