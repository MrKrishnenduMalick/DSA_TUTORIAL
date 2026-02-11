package array;

import java.util.Arrays;
import java.util.Scanner;

public class Mdimensio {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] arr2D = new int[3][3];

        // INPUT
        for(int row = 0; row < arr2D.length; row++){
            for(int col = 0; col < arr2D[row].length; col++){
                arr2D[row][col] = in.nextInt();
            }
        }

         // OUTPUT

        for(int r = 0; r<arr2D.length;r++){
          System.out.println(Arrays.toString(arr2D[r]));
        }

       
        // for(int r = 0; r < arr2D.length; r++){
        //     for(int c = 0; c < arr2D[r].length; c++){
        //         System.out.print(arr2D[r][c] + " ");
            // }
        //     System.out.println();
        // }

        

    }
}
