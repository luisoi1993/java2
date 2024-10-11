/*Leer 5 numeros, guardarlos en un arreglo y mostralos en el orden inverso
introducido
 */
package areglo5numerosinverso;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class Areglo5NumerosInverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float numeros[]=new float[5];
        
        System.out.println("Digite los numeros del areglo: ");
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("Digite el numero: "+(i+1));
            numeros[i]=entrada.nextFloat();
            
        }
        
         System.out.println("Digite el numero: ");
        for(int i=4;i>=0;i--){
            System.out.println(numeros[i]);
        }
        
    }
    
}
