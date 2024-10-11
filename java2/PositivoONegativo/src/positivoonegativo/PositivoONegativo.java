/*Leer un número e indicar si es positivo o negativo.
El proceso se reopetirá hasta que se inttroduzca 0
 */
package positivoonegativo;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class PositivoONegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        while(numero!=0){
            if(numero>0){
                JOptionPane.showMessageDialog(null,"El numero : "+numero+" es positivo.");
                numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
            }
            else{
                JOptionPane.showMessageDialog(null,"El numero : "+numero+" es negativo.");
                numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
            }
        }
        
        
        
        
                
    }
    
}
