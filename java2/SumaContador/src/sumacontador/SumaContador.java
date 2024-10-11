/*Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
introducidos
 */
package sumacontador;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class SumaContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=1,suma=0;
        
        while(numero!=0){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite e numero para sumar: "));
            suma=suma+numero;
        }
        
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+suma);
         
   }
    
}
