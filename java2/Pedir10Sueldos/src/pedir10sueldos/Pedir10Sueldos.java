/*Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores
de $1000.
 */
package pedir10sueldos;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class Pedir10Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0,numero,contma=0,suma=0;
        
        while(cont<=9){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el sueldo numero: "+(cont+1)));
            if(numero>1000){
                contma++;
            }
            suma=suma+numero;
            cont++;
        }
        JOptionPane.showInputDialog(null,"La suma total de sueldos es "+suma+"\n"
        +"Los sueldos mayores de $1000 son "+contma);
    }
    
}
