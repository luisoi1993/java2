/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesoenvases;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class PesoEnvases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        int numCasos;
        float pesoTotal,pesoComida,pesoFinal;
        
        System.out.println("Digite el numero de pedidos que quiere pesar: ");
        System.out.println("Digite el peso total del producto: ");
        pesoTotal=entrada.nextFloat();
        
        System.out.println("Digite el peso sin envase del producto: ");
        pesoComida=entrada.nextFloat();
        
        
        pesoFinal=pesoTotal-pesoComida;
        
        System.out.println("El peso final es: "+pesoFinal);
                
    }
    
}
