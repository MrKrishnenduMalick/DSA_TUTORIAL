package array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];
    // array of primitives
    // input using for loops

    for(int i = 0; i < arr.length; i++){
      arr[i] = in.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    // for(int i = 0; i < arr.length; i++){
    //   System.out.println(arr[i]+" ");
    // }
    // for(int num : arr){//for every element in the array, print the element
    //   System.out.println(num + " "); // here num represent element of the array
    // }


    // array of obejcts

    String[] str = new String[4];
    for(int j = 0 ;j < str.length; j ++){
      str [j] = in.next();
    }
    System.out.println(Arrays.toString(str));
  }
}
