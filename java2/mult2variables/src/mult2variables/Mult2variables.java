/*Hacer un programa que calcule e imprima el salario semanal de un empleado a partir
de sus horas semanales trabajadas y de su salario por hora.
 */
package mult2variables;

/**
 *
 * @author luis
 */
import java.util.Scanner;

public class Mult2variables {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario, horas,resultado;
        
        System.out.println("Digite el numero de horas trabajadas este mes: ");
        horas=entrada.nextFloat();
        
        System.out.println("Digite el salario por hora: ");
        salario=entrada.nextFloat();
        
        resultado=horas*salario;
        
        System.out.println("El salario es: "+resultado);
        
        
        
    }
    
}
