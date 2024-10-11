/*Pedir 5 calificaciones de alumnos y decir al final
si hay algún suspenso
 */
package pkg5notasversihaysiuspensos;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0,num;
        boolean suspenso=false;
        
        while(cont<5){
            num=Integer.parseInt(JOptionPane.showInputDialog("Digite la nota:  "));
            
            cont++;
            if(num<5){
                suspenso=true;
            }
        }
        if(suspenso==true){
            JOptionPane.showInputDialog("Hay suspensos: ");
        }
        else{
            JOptionPane.showInputDialog("No hay suspensos: ");
        }
        
        
    }
    
}
