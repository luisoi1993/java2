/*Construir un programa que calcule y muestre por pantalla las raices de
la ecuacion de segundo grado de coeficientes reales
*/
package ecuacionessegundogrado;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class EcuacionesSegundoGrado {

    
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       
       System.out.println("Digite los valores de ax,bx,c separados por ','");
       
       String valores=entrada.nextLine();
       
       String[]numeros=valores.split(",");
       
       int a=Integer.parseInt(numeros[0]);
       
       int b=Integer.parseInt(numeros[1]);
       
       int c=Integer.parseInt(numeros[2]);
       
       double x1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
       
       double x2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
       
       System.out.println("La solucion de x1: "+x1);
       System.out.println("La solucion de x2: "+x2);
    }
    
}
