/*Pedir números hasta que se teclee uno negativo, y
mostrar cuántos números se han introducido
 */
package contarnumeroshastanegativo;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class ContarNumerosHastaNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=1,cont=0;
        
        while(numero>=0){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            cont++;
        }
        
        cont=cont-1;
        JOptionPane.showMessageDialog(null,"Se ha digitado un total de "+cont+" numeros");
         
         
    }
    
}
