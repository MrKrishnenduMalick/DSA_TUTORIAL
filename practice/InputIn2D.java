package practice;

import java.util.Scanner;

public class InputIn2D {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the size of row");
    int row = in.nextInt();
    
    System.out.println("Enter the size of col");
    int col = in.nextInt();
    
    int nums[][] = input(row,col,in);
    
    output(nums);
  }
  
  static int [][] input(int row, int col, Scanner in){
    int [][] arr = new int[row][col];
    
    // System.out.println("Enter"+row, col+"elements");
    
    for(int i = 0;i < arr.length; i ++){
      for(int j = 0;j < arr[i].length; j++){
        arr [i][j] = in.nextInt();
      }
    }
    return arr;
  }
  
  static void output(int[][] arr){
    System.out.println("Array elemnets :");
    
    for(int i = 0;i < arr.length; i ++){
      for(int j = 0;j < arr[i].length; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}
