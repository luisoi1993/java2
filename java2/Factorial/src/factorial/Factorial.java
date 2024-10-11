/*Pedir un numero y pedir su factorial
 */
package factorial;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,cont=1,mult=1;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero al que quiere realizar el factorial: "));
        
        while(cont<=numero){
            mult=mult*cont;
            cont++;
        }
        
        JOptionPane.showMessageDialog(null,"El resultado es: "+mult);
    }
    
}
