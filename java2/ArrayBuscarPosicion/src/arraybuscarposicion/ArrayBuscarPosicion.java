/*Diseñar una aplicación que declare una tabla de 10 elementos enteros.
Leer mediante el teclado 8 números.Después se debe pedir un número y una
posicion, insertarlo en la posicion indicada, desplazando los que estén 
detrás.
 */
package arraybuscarposicion;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class ArrayBuscarPosicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int num[]=new int[10];
        int num2[]=new int[10];
        int posicion,numero;
        
        for(int i=0;i<10;i++){
            System.out.println("Digite el numero "+(i+1));
            num[i]=entrada.nextInt();
        }
        for(int i=0;i<10;i++){
            num2[i]=num[i];
        }
        System.out.println("Digite el numero: ");
        numero=entrada.nextInt();
        System.out.println("Digite la posicion del array: ");
        posicion=entrada.nextInt();
        
        num[posicion]=numero;
        
        while(posicion<9){
            num[posicion+1]=num2[posicion];
            posicion++;
        }
        
        for(int i=0;i<10;i++){
            System.out.println(num[i]);
        }
        
    }
    
}
