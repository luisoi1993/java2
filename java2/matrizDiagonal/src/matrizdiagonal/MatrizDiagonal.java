/*Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos
de la diagonal principal sean 1 y el resto 0
 */
package matrizdiagonal;

/**
 *
 * @author luis
 */

public class MatrizDiagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[][]=new int [7][7];
        int aux=0;
        
        for (int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(j==aux && i==aux){
                    array[i][j]=1;
                    aux++;
                }
                else{
                    array[i][j]=0;
                }
            }
        }
        
        for(int i=0;i<7;i++){
            System.out.println();
            for(int j=0;j<7;j++){
                System.out.print(array[i][j]);
            }
      }
    }
    
}
