/*Leer por teclado una tabla de 10 elementos númericos enteros y una posición
(entre 0 y 9).ELiminar el elemento situado en la posición dada sin dejar huecos.
 */
package arrayborrarnumeroreorganizar;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class ArrayBorrarNumeroReorganizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeros[]=new int[10];
        int numeros2[]=new int[9];
        int posicion;
        
        for(int i=0;i<10;i++){
            System.out.println("Digite  el numero: "+(i+1));
            numeros[i]=entrada.nextInt();
        }
        
        System.out.println("Digite la posicion del numero que quiere borrar contando que la primera posicion en 0: ");
        posicion=entrada.nextInt();
        
        for(int i=0;i<10;i++){
            if(i<posicion){
                numeros2[i]=numeros[i];
            }
            else if(i==posicion){
                
            }
            else if(i>posicion){
                numeros2[i-1]=numeros[i-1];
            }
        }
        
        for(int i=0;i<10;i++){
            System.out.println(numeros2[i]);
        }
        
    }
    
}
