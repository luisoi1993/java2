/*Una compañia de ventad e carros usados, paga a su personal de ventas un salario
de $1000 mensuales, mas una comision de $150 por cada carro vendido , mas el 
5% del valor de la venta por carro. Cada mes l capturista de la empresa ingresa 
en la computadora  los datos pendientes.Hacer un programa que calcule e imprime 
el salario mensual de un vendedor dado. */

package sueldovendedorcarros;

/**
 *
 * @author luis
 */

import java.util.Scanner;
public class SueldoVendedorCarros {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int sueldo,comision,ventaTotal,numCoches;
        
        sueldo=1000;
        comision=150;
        ventaTotal=0;
        numCoches=0;
        
        System.out.println("Digite el total de de coches vendidos: ");
        numCoches=entrada.nextInt();
        numCoches=numCoches*150;
        sueldo=sueldo+numCoches;
        
        System.out.println("Digite el valor total de los coches: ");
        ventaTotal=entrada.nextInt();
        ventaTotal=ventaTotal/100*5;
        sueldo=sueldo+ventaTotal;
        
        System.out.println("El sueldo total es: "+sueldo);
        
        
        
        
        
        
        
    }
    
}
