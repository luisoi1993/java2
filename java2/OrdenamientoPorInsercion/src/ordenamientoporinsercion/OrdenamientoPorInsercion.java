/*Ordenamiento por inserccion.
 */
package ordenamientoporinsercion;

/**
 *
 * @author luis
 */
Scanner entrada=new Scanner(System.in);

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoPorInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos: "));
        
        arreglo =new int[nElementos];
        
        System.out.println("Digite el arreglo: ");
        for(int i=0;i<nElementos;i++){
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
            
        }
        //ordenamiento por insercion
        for(int i =0;i<nElementos;i++){
            pos=i;
            aux=arreglo[i];
            
            while((pos>0)&&(arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        
        System.out.print("\nOrder Ascendente: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }  
}
