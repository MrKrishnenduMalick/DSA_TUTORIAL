package bubblesort;

import java.util.Arrays;

import functions.swap;

public class Main {
  public static void main(String[] args) {
    int[] arr = {5,4,3,2,1};
    bubblesort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void bubblesort(int[] arr){

    boolean swapped;

    // run the steps
    for(int i = 0; i < arr.length; i++){
      swapped = false;
      // for each steo, max item will come at the last repective index
      for(int j = 1;j < arr.length-i;j++){
        // swap if the item is samller than the previous item
        if (arr[j] < arr[j-1]){
          int temp = arr[j];
          arr[j]=arr[j-1];
          arr[j-1] = temp;
          swapped = true;
        }
      }

      // if you don't swap a particular value of i , it means the array is sirted hence stop the program

      if (!swapped){
        break;
      }
    }
  }
}
