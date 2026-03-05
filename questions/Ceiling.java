package questions;

public class Ceiling {
  public static void main(String[] args) {
    int[] arr = {-18,-12,-11,-10,-5,-4,-1,5,9,8,45,56,88,98,100,121};
    int target = 56;
    int ans = ceiling(arr, target);
    System.out.println(ans);
  }

  static int ceiling(int[] arr, int target){
  
  if (target > arr[arr.length-1]){
    return -1;
  }
  int start = 0;
  int end = arr.length - 1;

  while (start <= end){
    // int mid = (start + end)/2;
    int mid = start + (end - start)/2;

    if(target < arr[mid]){
      end = mid - 1;
    }else if (target > arr[mid]){
      start = mid + 1;
    }else{
      return mid;
    }
  }
  return start;
 } 
}
