/*Hacer un programa que pas de KG a otra unidad de medida de masa, mostrar 
en pantalla un menú con ls opciones posibles.
 */
package kgaotramasa;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class KgaOtraMasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float unidad;
        int opcion;
        
       unidad=Float.parseFloat(JOptionPane.showInputDialog("Digite el total en kg: "));
       opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione en que quiere convirtir los kg: \n"
            +"1.A gramos\n"
            + "2.A mg"));
       
       switch(opcion){
           case 1: unidad=unidad *1000;
                   JOptionPane.showMessageDialog(null,"Son : "+unidad+" gr");
                   break;
                   
           case 2: unidad=unidad*1000000;
                    JOptionPane.showMessageDialog(null,"Son : "+unidad+" mg");
                    break;
                    
           default:JOptionPane.showMessageDialog(null,"Se equivoco de opcion de menu");
                    break;
       }
       
    }
    
}
