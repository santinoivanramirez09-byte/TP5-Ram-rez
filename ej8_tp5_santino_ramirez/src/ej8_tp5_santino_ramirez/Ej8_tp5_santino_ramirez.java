package ej8_tp5_santino_ramirez;
import java.util.Scanner;

public class Ej8_tp5_santino_ramirez {

    public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String num3 = scanner.nextLine();
        String[] num2 = num3.split(" ");
        String[][] num1 = new String[num2.length][2];
        for (int i = 0; i < num2.length; i++) {
            num1[i][0] = num2[i];
            num1[i][1] = String.valueOf(num2[i].length());
        }
        System.out.println("[Palabra]  [Letras]");
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num1[i][0] + " - " + num1[i][1]);
        }
    }
}