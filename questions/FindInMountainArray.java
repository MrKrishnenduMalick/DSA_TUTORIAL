package questions;

public class FindInMountainArray {
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 6, 4, 2};
    int target = 4;
    int ans = search(arr, target);
    System.out.println(ans);
  }

  static int search(int[] arr, int target){
    int peak = peakIndex(arr);
    int firstTry = orderAg(arr, target,0,peak);
    if(firstTry != -1){
      return firstTry;
    }
    return orderAg(arr, target, peak+1, arr.length-1);
  }

  static int orderAg(int [] arr,int target,int start,int end){

// find the array is shorted in asec or dec
boolean isAsac = (arr[start] < arr [end]);

  while (start <= end){
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

  public static int peakIndex(int[] arr){

    int start = 0;
    int end = arr.length-1;

     while (start < end){
    int mid = start + (end - start)/2;

    if(arr[mid] > arr[mid+1]){
      end = mid;//desecnding part of the array
    }else{
      start = mid + 1;//ascending part of the array
  }
 }
 return start;
  }
}
