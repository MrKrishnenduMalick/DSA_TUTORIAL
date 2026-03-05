package practice;

import java.util.Scanner;

public class MinMax {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the size :");
    int size = in.nextInt();
    
    int[] nums = input(size,in);
    int result1 = min(nums);
    int result2 = max(nums);
    System.out.println("Result "+  result1);
    System.out.println("Result "+  result2);
  }
  
  static int[] input(int size,Scanner in){
    int [] arr = new int[size];
    
    System.out.println("Enter "+ size + " elements");
    
    for(int i = 0; i < arr.length; i++){
      arr[i] = in.nextInt();
    }
    return arr;
  }
  
  static int max(int[] arr){
    int ans = arr[0];
    
    for(int i = 0; i < arr.length; i++){
      if (arr[i] > ans)
        ans = arr[i];
    }
    return ans;
  }
  
  static int min(int[] arr){
    int ans = arr[0];
    
    for(int i = 0; i < arr.length; i++){
      if (arr[i] < ans)
        ans = arr[i];
    }
    return ans;
  }
}
