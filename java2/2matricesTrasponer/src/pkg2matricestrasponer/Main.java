/*Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera
y trasponerla en la segunda
 */
package pkg2matricestrasponer;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
       int matriz[][]= new int[5][9];
       int matriz2[][]=new int[9][5];
       int array[]=new int[45];
       
       for(int i=0;i<5;i++){
           for(int j=0;j<9;j++){
               System.out.println("Digite el valor de la posicion: "+"["+i+"]"+" ["+j+"]");
               matriz[i][j]=entrada.nextInt();
           }
       }
       
       //Mostramos el primero
       
       for(int i=0;i<5;i++){
           System.out.println();
           for(int j=0;j<9;j++){
               System.out.print(matriz[i][j]);
           }
       }
       
       //Pegamos la matriz en un array.
       int bucle=0,colum=0;
       
       for (int i=0;i<45;i++){
           if(bucle<4){
               array[i]=matriz[bucle][colum];
               bucle++;
           }
           else{
               array[i]=matriz[bucle][colum];
               bucle=0;
               colum++;
           }
           
        
        }
       
       
       //Pegamos el array en la nueva matriz
       int fila=0,columna=0;
       
       for(int i=0;i<45;i++){
           if(fila<8){
               matriz2[fila][columna]=array[i];
               fila++;
            }
           else{
               matriz2[fila][columna]=array[i];
               fila=0;
               columna++;
           }
       }
       
       //Mostramos el ultimo array
       System.out.println();
       System.out.println();
       System.out.println();
       for(int i=0;i<9;i++){
           System.out.println();
           for(int j=0;i<5;i++){
               System.out.print(matriz2[i][j]);
           }
       }
              
       
       
    }
    
}
