/*Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene
 */
package cuantascifrastiene;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class CuantasCifrasTiene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 99.999"));
        
        if(numero<10){
            JOptionPane.showMessageDialog(null,"El numero tiene una cifra.");
                
        }
        else if(numero>=10 & numero<100){
            JOptionPane.showMessageDialog(null, "El numero tiene dos cifras: ");
        }
        else if(numero>=100 & numero<1000){
            JOptionPane.showMessageDialog(null, "El numero tiene tres cifras: ");
        }
        else if(numero>=1000 & numero<10000){
            JOptionPane.showMessageDialog(null, "El numero tiene tres cifras: ");
        }
        else if(numero>=10000 & numero<100000){
            JOptionPane.showMessageDialog(null, "El numero tiene cuatro cifras: ");
        }
    }
    
}
