
package ej1_tp5_santino_ramirez;


public class Ej1_tp5_santino_ramirez {

    
    public static void main(String[] args) {
         int [][]p1 = new int[2][2   ];
               p1[0][0]=4;
               p1[0][1]=5;
               p1[1][0]=3;
               p1[1][1]=2;
         for (int i=0;i<=1;i++){
             
             for(int j=0;j<=1;j++){
                 System.out.print("[" + p1[i][j] + "]");
             }
             System.out.println();
         }
    }
}

    

