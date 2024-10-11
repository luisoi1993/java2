/*Pide un número( que debe estar entre 0 y 10) y mosrar la 
tabla de multiplicar de dicho número
 */
package pidenumeroymult;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class PideNumeroYMult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero,mult;
       
       numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 10"));
       
       for(int cont=0;cont<=10;cont++){
           mult=numero*cont;
           JOptionPane.showInputDialog(numero+" X "+cont+"="+mult);
       }
    }
    
}

