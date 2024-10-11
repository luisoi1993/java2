/*Crear y cargar matrices de tamaño 3x3, 
sumarlas y motrar su suma
 */
package sumardosmatrices;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class SumarDosMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
      int [][] matriz = {{1,1,1},{1,1,1},{1,1,1}};
      int [][] matriz2={{1,1,1},{1,1,1},{1,1,1}};
      int suma=0;
      
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              suma=suma+matriz[i][j];
          }
      }
      
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              suma=suma+matriz2[i][j];
          }
      }
      
      System.out.println("El resultado de sumar todos los numeros de las dos matrices es: "+suma);
      
      
      
    }
    
}
