/*
Pedir una nota de 0 a 10 y mostrarla de la forma.Insuficiente,suficiente
,bien,notable y sobresaliente
 */
package insufisufisobre;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class InsufiSufiSobre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nota;
       
       nota=Integer.parseInt(JOptionPane.showInputDialog("Digite la nota final:  "));
      
       switch(nota){
           case 1:
           case 2:
           case 3:
           case 4: JOptionPane.showMessageDialog(null,"La nota: "+nota+"insuficiente ");
                  break;
           case 5: JOptionPane.showMessageDialog(null,"La nota: "+nota+"suficiente");
                   break;
           case 6: JOptionPane.showMessageDialog(null,"La nota: "+nota+"bien");
                    break;
                    
           case 7: 
           case 8:JOptionPane.showMessageDialog(null,"La nota: "+nota+"notable");
                 break;
                 
           case 9:
           case 10:
               JOptionPane.showMessageDialog(null, "La nota: "+nota+"sobresaliente");
               break;
       }
    }
    
}
