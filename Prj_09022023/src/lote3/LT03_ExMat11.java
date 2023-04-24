package lote3;
/**
 *
 * @author Renan
 */
public class LT03_ExMat11 {
    public static void main(String[] args){
        int [][] matriz = new int[8][8];
        
        for( int i = 0; i <= 7; i++){
            for( int j = 0; j <= 7; j++){
                
                switch (j | i){
                    case 0:
                    case 7:
                      matriz[i][j]= 1;
                      break;
                
            }
            }
            
            
        }
        
        for(int[] i : matriz){
            System.out.print("\n");
            for(int j : i){
                System.out.print(j);
            }
        }
    }
}
