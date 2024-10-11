/*Pedir un número N,introducir N sueldos, y mostrar
el sueldo máximo
 */
package pedirnumerosmostrarmasalto;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class PedirNumerosMostrarMasAlto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,sueldo=0,cont=0,sueldoFinal=0;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n: "));
        
        while(cont<n){
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Digite el sueldo: "));
            
            if(sueldo>sueldoFinal){
                sueldoFinal=sueldo;
            }
            cont++;
        }
        System.out.println("El mayor sueldo es: "+sueldoFinal);
    }
    
}
