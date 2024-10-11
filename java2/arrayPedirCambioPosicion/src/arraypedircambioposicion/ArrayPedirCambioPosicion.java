/*"Crear un programa que lea por teclado una tabla de 10 números enteros y 
desplace N posiciones en el arreglo (N es digitado por el usuario)"
 */
package arraypedircambioposicion;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class ArrayPedirCambioPosicion {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
 
        int[] numeros = new int[10];
        int posiciones,ultimo;
 
        for (int i = 0; i < 10; i++) {
           numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero "));
        }
        posiciones=Integer.parseInt(JOptionPane.showInputDialog("Digite una posicion "));
 
        for (int i = 0; i <= posiciones; i++) {
            ultimo=numeros[9];
            for (int j = 8; j >= 0; j--) {
                numeros[j+1]=numeros[j];
            }   numeros[0]=ultimo;
 
        }
        
        for(int i=0;i<10;i++){
            System.out.println(numeros[i]);
        }
    }
}
