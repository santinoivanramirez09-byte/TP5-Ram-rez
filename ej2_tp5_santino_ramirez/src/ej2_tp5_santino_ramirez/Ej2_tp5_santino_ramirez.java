
package ej2_tp5_santino_ramirez;

 
public class Ej2_tp5_santino_ramirez {


    public static void main(String[] args) {
        
               int [][]p1 = new int[3][3];
               p1[0][0]=1;
               p1[0][1]=5;
               p1[0][2]=4;
               p1[1][0]=2;
               p1[1][1]=4;
               p1[1][2]=5;
               p1[2][0]=1;
               p1[2][1]=2;
               p1[2][2]=3;
            int i = 0;
         while(i<=2){
             int j=0;
             while (j<=2){
                 System.out.print("[" + p1[i][j] + "]");
                         j++;
             }
             i++;
             System.out.println();
         }
               
    }
    
}   