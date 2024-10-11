/*Leer 10 números enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguente orden: el primero, el último, el
segundo, el penúltimo, el tercero , etc

 */
package array10numerosgrandepequeño;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class Array10NumerosGrandePequeño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeros[]= new int[10];
        int contMax=9,contMin=0;
        for(int i=0;i<10;i++){
            System.out.println("Digite un numero: ");
            numeros[i]=entrada.nextInt();
            
        }
        for(int i=0;i<5;i++){
           System.out.println(numeros[contMax]);
           contMax--;
           System.out.println(numeros[contMin]);
           contMin++;
        }
    }
    
}
