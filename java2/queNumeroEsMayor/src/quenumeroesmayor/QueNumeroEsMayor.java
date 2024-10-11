/*Pedir dos numeros y decir cual es mayor o si son iguales
 */
package quenumeroesmayor;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class QueNumeroEsMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num,num2;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        
        if(num>num2){
            JOptionPane.showMessageDialog(null,"El numero "+num+"es mayor que "+num2);
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero "+num+"es menor que "+num2);
        }
        
        
       
    }
    
}
