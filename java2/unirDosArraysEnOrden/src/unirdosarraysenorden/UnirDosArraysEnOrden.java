/*Leer dos series de 10 enteros que estarán ordenados crecimiente. Copiar
(fusionar) las dos tablas en una tercera, de forma que sigan ordenados
 */
package unirdosarraysenorden;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class UnirDosArraysEnOrden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numeros[]=new int[10];
        int numeros2[]=new int[10];
        int numeros3[]=new int[20];
        int numeroNuevo,numeroViejo=-500,numeroViejo2=-500,cont=0,cont2=0;
        
        //Pedir el primer aaray y comprobar que va en orden 
        for(int i=0;i<10;i++){
            System.out.println("Digite el numero: "+(i+1)+"Del primer array: ");
            numeroNuevo=entrada.nextInt();
            if(i==0){
                numeros[i]=numeroNuevo;
                numeroViejo=numeroNuevo;
            }
            if(i>0){
                if(numeroViejo>numeroNuevo){
                 System.out.println("El numero es menor digite uno mayor: ");
                 numeroNuevo=entrada.nextInt();
                 while(numeroViejo>numeroNuevo){
                    System.out.println("El numero es menor digite uno mayor: ");
                    numeroNuevo=entrada.nextInt(); 
                 }
                }
                else{
                    numeros[i]=numeroNuevo;
                    numeroViejo=numeroNuevo;
                }
            }
            
        }
        
         //Pedir el segundo aaray y comprobar que va en orden 
        for(int i=0;i<10;i++){
            System.out.println("Digite el numero: "+(i+1)+"Del segundo array: ");
            numeroNuevo=entrada.nextInt();
            if(i==0){
                numeros2[i]=numeroNuevo;
                numeroViejo2=numeroNuevo;
            }
            if(i>0){
                if(numeroViejo2>numeroNuevo){
                 System.out.println("El numero es menor digite uno mayor: ");
                 numeroNuevo=entrada.nextInt();
                 while(numeroViejo2>numeroNuevo){
                    System.out.println("El numero es menor digite uno mayor: ");
                    numeroNuevo=entrada.nextInt(); 
                 }
                }
                else{
                    numeros2[i]=numeroNuevo;
                    numeroViejo2=numeroNuevo;
                }
            }
            
            
        }
        
        //Rellenar el tercer arrray con los otros dos 
        //No funciona
        for(int i=0;i<20;i++){
            if(numeros[cont]<numeros2[cont2] && cont<9){
                numeros3[i]=numeros[cont];
                cont++;
            }
            if(numeros[cont]>numeros2[cont2] && cont2<9){
                numeros3[i]=numeros2[cont2];
                cont2++;
            }
            
            
            }
        if(cont==9){
                while(cont<10){
                    if(numeros[cont]<numeros2[cont2]){
                        
                    }
                }
        }
        
        for(int i=0;i<20;i++){
            System.out.println(numeros3[i]);
        }
        
        
        
        
    }
    
}
