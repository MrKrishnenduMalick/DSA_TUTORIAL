package questions;

public class Mountain {
  public static void main(String[] args) {
    int [] arr = {1,2,5,7,6,4,3};
    int ans = peak(arr);
    System.out.println(ans);
  }

  public static int peak(int[] arr){

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
