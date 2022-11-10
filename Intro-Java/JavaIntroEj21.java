package javaintroej21;

public class JavaIntroEj21 {

    public static void main(String[] args) {
        boolean contenida = false;
        int[][] matrizPri = {{1,2,3,4,2,3,1,2,3,4},
                            {2,3,52,4,2,3,4,28,3,1},
                            {24,3,2,4,2,3,4,2,30,1},
                            {4,3,2,7,2,3,54,2,3,1},
                            {2,3,2,6,2,3,4,2,39,1},
                            {23,3,2,4,2,3,4,2,3,1},
                            {2,3,2,4,2,3,64,2,3,1},
                            {2,13,2,4,2,3,4,2,3,1},
                            {2,3,2,4,2,3,44,27,3,1},
                            {2,3,2,4,2,32,7,2,3,1}};
        
        int[][] matrizSec = {{2,3,4},
                            {2,3,44},
                            {2,32,7}};
        outerloop:
        for (int i = 0; i < matrizPri.length; i++){
            for (int j = 0; j < matrizPri.length; j++){
                if(matrizPri[i][j] == matrizSec[0][0]){                   
                    if (estaContenida(matrizPri, matrizSec, i, j)){
                        System.out.println("Esta contenida pos i: "+i+" pos j: "+j);
                        contenida = true;
                        break outerloop;
                    }
                }
            }
        }
        if(!contenida){
            System.out.println("NO esta contenida");
        }
    }
    
    public static boolean estaContenida(int[][]mP, int[][]mS, int posI, int posJ){
        for (int i = 0; i < mS.length; i++){
            for (int j = 0; j < mS.length; j++){
                if (mS[i][j] != mP[posI + i][posJ + j]){
                    return false;
                }
            }
        }
        return true;
    }
    
}
