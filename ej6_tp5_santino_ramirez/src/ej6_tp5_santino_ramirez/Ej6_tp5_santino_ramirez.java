package ej6_tp5_santino_ramirez;
import java.util.Scanner;

public class Ej6_tp5_santino_ramirez {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas filas desea?");
        int filas = lector.nextInt();
        System.out.println("Cuantas columnas quiere?");
        int columnas = lector.nextInt();
        int [][]num1= new int[filas][columnas];
        int x=0;
        int p=0;
        for (int i=0;i<filas;i++) {
            for (int j=0;j<columnas;j++) {
                System.out.print("Ingrese un numero [" + i + "][" + j + "]: ");
                    num1[i][j] = lector.nextInt();
                if (j % 2 != 0) {
                    x = x + num1[i][j];
                    p++;
                }
            }
        }
        for (int i=0;i<filas;i++) {
            for (int j=0;j<columnas;j++) {
                System.out.print("[" + num1[i][j] + "]");
            }
            System.out.println();
        }
        if (p==0){
            p++;
        }
        System.out.println("Promedio :  " + x/p);
    }
}

