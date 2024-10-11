/*Hacer un programa que calcule el cuadrado de una suma 
 */
package elcuadradodeunasuma;

/**
 *
 * @author luis
 */
import java.lang.Math;
import java.util.Scanner;
public class ElCuadradoDeUnaSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double n,s,suma;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el valor del primer numero de la suma: ");
        n=entrada.nextDouble();
   
        System.out.println("Digita el valor del segundo numero de la suma: ");
        s=entrada.nextDouble();
        
        suma=(n+s);
        suma=Math.pow(suma, 2);
        
        System.out.println("El resultado es: "+suma);
        
        
      
        
         
    }
    
}
