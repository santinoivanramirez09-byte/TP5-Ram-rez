
package ej7_tp5_santino_ramirez;
import java.util.Scanner;
public class Ej7_tp5_santino_ramirez {

   
    public static void main(String[] args) {
        
                     Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas filas quiiere");
        int filas = lector.nextInt();
        System.out.println("Cuantas columnas quiere?");
        int columnas = lector.nextInt();
        int [][]num1= new int[filas][columnas];
        int x=0;
        int y=0;
        for (int i=0;i<filas;i++) {
            for (int j=0;j<columnas;j++) {
                System.out.print("Ingrese un numero [" + i + "][" + j + "]: ");
                    num1[i][j] = lector.nextInt();
                if (j % 2 != 0) {
                    x = x + num1[i][j];
                    y++;
                }
            }
        }
        for (int i=0;i<filas;i++) {
            for (int j=0;j<columnas;j++) {
                System.out.print("[" + num1[i][j] + "]");
            }
            System.out.println();
        }
        if (y==0){
            y++;
        }
        System.out.println("el promedio es de:  " + x/y);
    }
}

