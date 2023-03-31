/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class LT03_ExMat00 {
    public static void main(String[] args){
        double[] mediaAlunos = new double[3]; 
        double mediaProvas[] = new double[2];        
        double notas[][] = new double[3][2];
        int con;
        Scanner ler = new Scanner(System.in);
        
        
        for( int i = 0; i < 3; i++){
            System.out.println("notas aluno " +(1+i));
            for(int j = 0; j < 2; j++){
                
                notas[i][j] = ler.nextDouble();
                mediaAlunos[i] += notas[i][j];
                mediaProvas[j]+= notas[i][j];
            }
            mediaAlunos[i] /= 2;
            
        }
        
        for(double[] aluno : notas){
            int cont = 0;
            System.out.println("");
            for(double nota :aluno){
                cont++;
                System.out.printf("nota %s %.2f %n",cont, nota);
            }

        }
        
        for(double media : mediaAlunos){

            System.out.printf("A media do aluno eh %.2f %n",media);
        }


        System.out.printf("A media da prova 1  eh %.2f%n", mediaProvas[0]/3);
        System.out.printf("A media da prova 1 eh %.2f%n", mediaProvas[1]/3);

   
    }
}
