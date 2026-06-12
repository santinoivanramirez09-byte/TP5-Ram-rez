package ej10_tp5_santino_ramirez;
import java.util.Random;
import java.util.Scanner;
public class Ej10_tp5_santino_ramirez {
 
    public static void main(String[] args) {

   int[][] temp = new int[5][7];
        lm(temp);
        ts(temp);
        ps(temp);
    }
    public static void lm(int[][] temp) {
        Random random = new Random();
        int dia=1;
        for (int i=0;i<5;i++) {
            for (int j=0;j<7;j++) {
                if (dia<=31) {
                    temp[i][j] = random.nextInt(32) + 7;
                    dia++;
                }
            }
        }
    }
    public static void ts (int[][] temp) {
        for (int i=0;i<5;i++) {
            int mayor=temp[i][0];
            int menor=temp[i][0];
            int dm=0;
            int dme=0;
            for (int j=0;j<7;j++) {
                if (temp[i][j]>mayor) {
                    mayor=temp[i][j];
                    dm=j;
                }
                if (temp[i][j]<menor) {
                    menor=temp[i][j];
                    dme=j;
                }
            }
            System.out.println("Semana " + (i + 1) + " | Mayor: " + mayor + " dia " + dm + " | Menor: " + menor + " dia " + dme);
        }
    }
    
    public static void ps(int[][] temp) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una semana (1-5): ");
        int semana = scanner.nextInt() - 1;
        int suma = 0;
        for (int j=0;j<7;j++) {
            suma=temp[semana][j];
        }
        double num=(double)suma/7;
        System.out.println("Promediode la semana " + (semana + 1) + ": " + num);
    }
}        

