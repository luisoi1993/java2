/*En mrgaplaza se hace un 20% de descuento a los
clientes cuya compra supere los $300.¿cual sera 
la cantidad que pagarà una persona por su compra
 */
package descuento;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class Descuento {

    
    public static void main(String[] args) {
        float precio,descuento;
        
        precio=Float.parseFloat(JOptionPane.showInputDialog("Digite el total de la compra: "));
        
        if(precio<300){
            JOptionPane.showMessageDialog(null,"El precio es :"+precio);
            
        }
        else{
            descuento=precio*20/100;
            precio=precio-descuento;
            JOptionPane.showMessageDialog(null,"El precio es : "+precio);
        }
        
    }
    
}
