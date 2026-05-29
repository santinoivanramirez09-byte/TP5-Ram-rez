package ej4_tp5_santino_ramirez;

import java.util.Scanner;

public class Ej4_tp5_santino_ramirez {
    
    public static void main(String[] args) {
        
        
         Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas filas desea?");
        int filas = scanner.nextInt();
        System.out.println("Cuantas columnas desea?");
        
        int columnas = scanner.nextInt();
        scanner.nextLine();
        String [][]num1= new String[filas][columnas];
       
             for(int i=0;i<filas;i++){
                 for(int j=0;j<columnas;j++){
                 System.out.print("ponga un valor a la matriz y su posicion actual: [" + i + j + "], ( la fila [0 x] esta reservada para nombres");
                 num1[i][j]=scanner.nextLine();
             }
             }
        for (int i=0;i<filas;i++){
             for(int j=0;j<columnas;j++){
                 System.out.print("[" + num1[i][j] + "]");
             }
             System.out.println();
         }
    }
    
}
     
    