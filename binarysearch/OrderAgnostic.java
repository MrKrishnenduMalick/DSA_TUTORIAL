package binarysearch;

public class OrderAgnostic {
  public static void main(String[] args) {
    // int[] arr = {-18,-12,-11,-10,-5,-4,-1,5,9,8,45,56,88,98,100,121};
    int[] arr2 = {18,12,11,10,5,4,1,-5,-9,-8,-45,-56,-88,-98,-100,-121};
    int target = -98;
    // int ans = orderAg(arr, target);
    int ans2 = orderAg(arr2, target);
    // System.out.println(ans);
    System.out.println(ans2);
  }

  static int orderAg(int [] arr,int target){

  int start = 0;
  int end = arr.length - 1;

// find the array is shorted in asec or dec
boolean isAsac = (arr[start] < arr [end]);

  while (start <= end){
    // int mid = (start + end)/2;
    int mid = start + (end - start)/2;

    if(arr[mid] == target){
      return mid;
    }

    if(isAsac){
      if(target < arr[mid]){
      end = mid - 1;
    }else if (target > arr[mid]){
      start = mid + 1;
    }else{
      return mid;
    }
    }else{
      if(target > arr[mid]){
      end = mid - 1;
    }else if (target < arr[mid]){
      start = mid + 1;
    }else{
      return mid;
    }
    }
    
  }
  return -1;
  }
}
