/*Leer los datos correspondiente ados tablas de 12 elemenros númericos,
y mezclarlos en una tercera de la forma: 3 de la tabla
A, 3 de la B,otros 3 de A,otros 3 de la B, etc.
 
 */
package mezclar2arraysde3en3;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class Mezclar2ArraysDe3En3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int num[]=new int[12];
        int num2[]=new int[12];
        int num3[]=new int[24];
        int cont=0,cont2=0,cont3=0;
        
        for(int i=0;i<12;i++){
            System.out.println("Digite los numeros del primer array: ");   
            num[i]=entrada.nextInt();
        }
        
        for(int i=0;i<12;i++){
            System.out.println("Digite los numeros del segundo array: ");
            num2[i]=entrada.nextInt();
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                num3[cont3]=num[cont];
                cont3++;
                cont++;
            }
            for(int r=0;r<3;r++){
                num3[cont3]=num2[cont2];
                cont3++;
                cont2++;
            }
        }
        for(int i=0;i<24;i++){
            System.out.println(num3[i]);
        }
    }
    
}
