package lote2;
/*
    @author: Renan Gama
    Data criação: 07/03/2023
    versão 01
 */
import java.util.Scanner;

public class LT02_ExMod21 {
    static double nota, media = 0;
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args){
        lerNotas();
        
        System.out.printf("O aluno esta %s media: %s",verificarSituacao(), media);
        
    }
    
    static void lerNotas(){ // ler as notas e as enviar para o metodo de calcularMedia
        for( int i = 0; i < 4; i++){
            System.out.printf("Digite a %s nota %n", i+1);
            nota = ler.nextDouble();
            calcularMedia(nota, i);
        }
    }
    
    static void calcularMedia(double nota, int i){ // incrementa a variavel media com o valor das notas, e quando recebe a ultima nota, calcula a media
        
        media = i != 3 ? media += nota : (media += nota)/4 ;
    }
    
    static String verificarSituacao(){ // verifica a situação do aluno de acordo com sua media
        String situacao;
        
        if(media >= 6){
            situacao = "Aprovado";
        }else if( media >= 3){
            situacao = "Exame";
        }else{
            situacao = "Reprovado";
        }

        return situacao;
    }
}
