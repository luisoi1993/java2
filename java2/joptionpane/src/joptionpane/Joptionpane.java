/*Entrada y salida con Joptionpane
 */
package joptionpane;

/**
 *
 * @author luis
 */

import javax.swing.JOptionPane;


public class Joptionpane {

  
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena=JOptionPane.showInputDialog("Digite una cadena: ");
        entero=Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra=JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal=Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        
        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null,"El caracter es: "+letra);
        JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);
        
    }
    
}
