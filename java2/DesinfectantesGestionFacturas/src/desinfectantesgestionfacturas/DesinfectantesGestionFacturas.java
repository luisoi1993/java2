/*Una empresa que se dedica a la venta de desinfectantes necesita un programa para
gestionar las facturas.En cada factura figura: el codigo del articulo, la cantidad endida en
litros y el precio por litro.Se pide de 5 facturas introducidas: Facturación total, cantidad
en litros del articulo 1 y cauntas facturas se emitieron de mas de $600

Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por 
litro.Solo existen tres productos con precios:
1-0,6$/litro
2-3 $/litro
3-1,25/litro
*/
package desinfectantesgestionfacturas;

/**
 *
 * @author luis
 */
import javax.swing.JOptionPane;
public class DesinfectantesGestionFacturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codigo,litros,litrosArticulo1=0,conteoMas600=0,eleccion;
        float precioLitro=0,importeFactura,facturacionTotal=0;
        
        for(int i=1;i<=5;i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Articulo Nº"+i+"\nDigite el codigo: "));
            litros=Integer.parseInt(JOptionPane.showInputDialog("Articulo nº"+i+"\nDigite la cantiddad en litros: "));
            
            eleccion=Integer.parseInt(JOptionPane.showInputDialog("Articulo nº"+i+"\nSeleccione el precio: \n"
            +"\n 1: 0,6 "
            + "\n 2: 3 "
            +"\n 3: 1,25"));
            
            if(eleccion==1){
                precioLitro=0.6f;
                
            }
            else if(eleccion==2){
                precioLitro=3;
            }
            else if(eleccion==3){
                precioLitro=1.25f;
            }
            else{
                JOptionPane.showInputDialog("Eleccion incorecta: ");
            }
            importeFactura=(float)litros*precioLitro;
            facturacionTotal+=importeFactura;
            
            if(codigo==1){
                litrosArticulo1+=litros;
            }
            if(importeFactura > 600){
                conteoMas600++;
            }
            
        }
        
        System.out.println("Resumen de ventas: ");
        System.out.println("Facturacion total:  "+facturacionTotal);
        System.out.println("Cantidad de litros vendidos del articulo 1 "+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);
    }
    
}
