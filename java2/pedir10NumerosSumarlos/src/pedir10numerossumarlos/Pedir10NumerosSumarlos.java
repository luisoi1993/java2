/*
Pedir 10 números y escribir la suma total
 */
package pedir10numerossumarlos;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class Pedir10NumerosSumarlos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero,suma=0,cont=0;
       
       while(cont<10){
           numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el "+(cont+1)+"para sumar: "));
           suma=suma+numero;
           cont++;
       }
       
       JOptionPane.showMessageDialog(null,"El resultado es: "+suma);
       
               
    }
    
}
