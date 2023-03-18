/*
    @author: Renan Gama
    Data criação: 16/03/2023
    versão 01
    @author Renan
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LT02_ExMod30 {
    static int diaNascimento, mesNascimento, anoNascimento, diaAtual, mesAtual, anoAtual;
    public static void main(String[] args){
        int quantidadeBissextos;
        
        diaAtual = pegarDataSistema("dd");
        mesAtual = pegarDataSistema("MM");
        anoAtual = pegarDataSistema("yyyy");
        
        System.out.printf("%s/%s/%s", diaAtual,mesAtual,anoAtual);
        
        diaNascimento = pegarDataNascimento("dia");
        mesNascimento = pegarDataNascimento("mes");
        anoNascimento = pegarDataNascimento("ano");
        
        diaAtual += calcularBissextos();
        
        System.out.printf("Voce tem %s anos, %s Messes, %s Dias", calcularAno(), calcularMes(), calcularDia());
        
        
    }
    
    
    
    private static int pegarDataSistema(String DiaMesAno){
        LocalDateTime agora = LocalDateTime.now(); // pega a data e hora atual
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern(DiaMesAno); // pega a hora e formata ela (HH:mm:ss)
        String data = formatterHora.format(agora); // atribui a hora a variavel hora
        return Integer.parseInt(data);
    }
    
    private static int pegarDataNascimento(String texto){
        Scanner ler = new Scanner(System.in);
        System.out.printf("\nDigite o %s que você nasceu: ", texto);
        return ler.nextInt();
        
    }
    
    private static int calcularBissextos(){
        int quantidadeBissextos = 0;
        if(mesNascimento == 2 && diaNascimento == 29){
        
        }else if(mesNascimento > 2){
            if(mesAtual <= 2){
                quantidadeBissextos = calcularAnosBissetos((anoNascimento + 1), (anoAtual - 1));
            }else{
                quantidadeBissextos = calcularAnosBissetos((anoNascimento + 1), anoAtual);
            }
        }else{
            if(mesAtual <= 2){
                quantidadeBissextos = calcularAnosBissetos(anoNascimento , (anoAtual - 1));
            }else{
                quantidadeBissextos = calcularAnosBissetos(anoNascimento , anoAtual);
            }
        }
        return quantidadeBissextos;
    }
    
    private static int calcularAnosBissetos(int anoInicial, int anoFinal){
        int quantidadeAnoBissesxos = 0;
        for(int i = anoInicial; i <= anoFinal; i++){
            boolean multiplo400 = i % 400 == 0;
            boolean multiplo4 = i % 4 == 0;
            boolean naoMultiplo100 = i % 100 != 0;

            if( multiplo4){
                if(naoMultiplo100){
                    quantidadeAnoBissesxos++;                   
                }else if(multiplo400){
                        quantidadeAnoBissesxos++;
                    }               
            }
        }
        
        return quantidadeAnoBissesxos;  
    }
    
   private static int calcularAno(){
       int idadeAno;
       
       return idadeAno = anoAtual - anoNascimento;
       
   }
   
   private static int calcularMes(){
       int idadeMes;
       
       idadeMes = mesAtual - mesNascimento;
       
       if( idadeMes < 0){
           idadeMes = 12 - idadeMes;
           anoAtual--;
       }
       return idadeMes;
   }
   
   private static int calcularDia(){
       int idadeDia;
       
        idadeDia =  diaAtual - diaNascimento ;
        if( idadeDia < 0){
            idadeDia = verificarMes(mesAtual) - idadeDia ;
            mesAtual--;
        }
        return idadeDia;
   }
   
   private static int verificarMes(int mes){
       switch (mes){
           case 1:
               return 31;
           case 2:
               return 28;
           case 3:
               return 31;
           case 4:
               return 30;
           case 5:
               return 31;
           case 6:
               return 30;
           case 7:
               return 31;
           case 8:
               return 31;
           case 9:
               return 30;
           case 10:
               return 31;
           case 11:
               return 30;
           case 12: 
               return 31;
           default:
               return -100000;
               
       }
   }
}
