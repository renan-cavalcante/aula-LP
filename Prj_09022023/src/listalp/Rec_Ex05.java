package listalp;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renan
 */
public class Rec_Ex05 {
     public static void main(String[] args){
        try (Scanner ler = new Scanner(System.in)) {
			int numero = ler.nextInt();
			System.out.print(calcularSerie(numero )); // manda o numero duas vezes
		}
    }
    static int calcularSerie(int numero){
        int serie = 0;
        if( numero != 1){
            calcularSerie(numero-1);
            serie += calcularSerie(numero-1) +fatorar(numero);
            return serie;
        }else{
            return 1;
        }
    } 
    static int fatorar(int numero){
        int fatorial;
        if(numero != 1){
            fatorial = numero * fatorar(numero - 1);
            return fatorial;
        }
        return 1;
    }
}
