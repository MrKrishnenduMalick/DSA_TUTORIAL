package practice;

import java.util.Scanner;

public class LinearSearch {
   public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the Size:");
    int size = in.nextInt();

    int[] nums = input(size,in);

    int result = search(nums,45);

    System.out.println("Result: " + result);
  }

  static int[] input(int size,Scanner in){
    int[] arr = new int[size];
    for(int i = 0;i < arr.length; i++){
      arr[i] = in.nextInt();
    }
    return arr;
  }

  static int search(int[] arr, int target){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == target){
        return i;
      }
    }
    return -1;
  }
}
