/*
 */
package metodoburbuja;

/**
 *
 * @author luis
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int arreglo[],nElementos,aux;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del areglo: "));
        
        arreglo=new int[nElementos];
        
        for(int i=0;i<nElementos;i++){
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
            
        }
         
       //Metodo burbuja
       for(int i=0;i<(nElementos-1);i++){
           for(int j=0;j<(nElementos-1);j++){
              if(arreglo[j]>arreglo[j+1]){
                 aux=arreglo[j]; 
                 arreglo[j]=arreglo[j+1];
                 arreglo[j+1]=aux;
              } 
           }
        }
           
           for(int i=0;i<nElementos;i++){
           System.out.println(arreglo[i]+" - ");
            }
       
    }
    
}
