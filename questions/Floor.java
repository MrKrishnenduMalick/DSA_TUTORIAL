package questions;

public class Floor {
  public static void main(String[] args) {
    int[] arr = {-18,-12,-11,-10,-5,-4,-1,5,9,8,45,56,88,98,100,121};
    int target = 56;
    int ans = floor(arr, target);
    System.out.println(ans);
  }

  static int floor(int[] arr, int target){
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
      return end;
    }
  }
  return start;
 }
}
