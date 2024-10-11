/*Hacer un programa que tome dos numeros y diga si ambos
son pares o impares.
 */
package dosnumerosparesoimpares;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class DosNumerosParesOImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num,num2,par,par2;
       
       num=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
       num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el seegundo nummero: "));
       
       par=num%2;
       par2=num2%2;
       
       if(par==0 & par2==0){
          JOptionPane.showMessageDialog(null,"Los dos numeros son pares: ");  
        
    }
       else if(par!=0 & par2!=0){
           JOptionPane.showMessageDialog(null,"Los dos numeros son impares: ");
       }
       
       else{
           JOptionPane.showMessageDialog(null, "Un numero es par y el otro impar");
       }
    }
    
}
