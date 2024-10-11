/*Queremos desarollar una aplicación que nos ayude a gestionar
las notas de un cento educativo.Cada grupo(o clase) está compuesto 
por 5 alumnos.Se pide leer las notas del primer,segundo y tercer trimestre 
de un grupo.Debemos mostrar al final: la nota media del grupo en cada trimestre, 
la media del alumno que se encuentra en la posicion N
(N se lee por teclado)
 */
package arraysnotasmedia;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class ArraysNotasMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int trimestre1[]=new int[5];
        int trimestre2[]=new int[5];
        int trimestre3[]=new int[5];
        int posicion,suma=0,suma2=0,suma3=0,sumaAlumno=0;
        float mediaAlumno,media1,media2,media3;
        
        for(int i=0;i<5;i++){
            System.out.println("Digite la nota del perimer trimestre del alumno con posicion: "+i);
            trimestre1[i]=entrada.nextInt();
           
        }
        
        for(int i=0;i<5;i++){
           System.out.println("Digite la nota del segundo trimestre del alumno con posicion: "+i);
           trimestre2[i]=entrada.nextInt();
           
        }
        
         for(int i=0;i<5;i++){
            System.out.println("Digite la nota del tercer trimestre del alumno con posicion: "+i);
            trimestre3[i]=entrada.nextInt();
           
        }
         
        System.out.println("Dgite la posicion del alumno del que quiere saber la media: ");
        posicion=entrada.nextInt();
        
        for(int i=0;i<5;i++){
            if(i==posicion){
                sumaAlumno=trimestre1[i]+sumaAlumno;
            }
            suma=trimestre1[i]+suma;
        }
        
        for(int i=0;i<5;i++){
            if(i==posicion){
                sumaAlumno=trimestre2[i]+sumaAlumno;
            }
            suma2=trimestre2[i]+suma2;
        }
        
         for(int i=0;i<5;i++){
            if(i==posicion){
                sumaAlumno=trimestre3[i]+sumaAlumno;
            }
            suma3=trimestre3[i]+suma3;
        }
         
         mediaAlumno=sumaAlumno/3;
         media1=suma/5;
         media2=suma2/5;
         media3=suma3/5;
         
         System.out.println("La media del alumno con poscion: "+posicion+"es: "+mediaAlumno);
         System.out.println("La media del primer trimestre es: "+media1);
         System.out.println("La media del segundo trimestre es: "+media2);
         System.out.println("La media del tercer trimestre es: "+media3);
         
         
         
         
        
    }
    
}
