public class Main {
    public static void main(String[] args) {

      
        int[][] matriz = {
            {5, 3, 0},
            {8, 2, 0},
            {10, 7, 0},
            {4, 9, 0}
        };

        
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][2] = matriz[i][0] + matriz[i][1];
        }

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
