/*
    @author: Renan Gama
    Data criação: 08/03/2023
    versão 01
 */
import java.util.Scanner;

public class LT02_ExMod25 {
    static int HoraIni, HoraFim, MinutoIni, MinutoFim, Hora, minuto;
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args){
        
        receberHoras();
        
        HoraIni = converterHoraMinuto(HoraIni,  MinutoIni);
        HoraFim = converterHoraMinuto(HoraFim , MinutoFim);
        
        calcularHorario( HoraIni, HoraFim);
        
        System.out.printf("%s:%s", Hora, minuto);
    }
    
    static void receberHoras(){
        System.out.printf("%n Digite a hora de inicio do jogo: ");
        HoraIni = ler.nextInt();
        System.out.printf("%n Digite o minuto de inicio do jogo: ");
        MinutoIni = ler.nextInt();
        System.out.printf("%n Digite a hora do fim do jogo: ");
        HoraFim = ler.nextInt();
        System.out.printf("%n Digite o minuto do fim do jogo: ");
        MinutoFim   = ler.nextInt();      
                
    }
    
    static int converterHoraMinuto(int hora, int minuto){
        return (hora * 60) + minuto;
    }
    
    static void calcularHorario(int horaInicial, int horaFinal){
        if(horaInicial > horaInicial){
            Hora = ((1440-horaInicial) + horaFinal) / 60;
            minuto = ((1440 - horaInicial) + horaFinal) %60;
        }else{
            Hora = ((horaFinal - horaInicial)/ 60);
            minuto = ((horaFinal - horaInicial)% 60);
        }
    }
}
