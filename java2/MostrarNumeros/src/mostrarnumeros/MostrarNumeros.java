/*Pedir un número N, y mostrar todos los números
del 1 al N
 */
package mostrarnumeros;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class MostrarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=1,n;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n: "));
      
        while(cont<=n){
            JOptionPane.showMessageDialog(null,cont);
            cont++;
            
            

        }
    }
    
}
