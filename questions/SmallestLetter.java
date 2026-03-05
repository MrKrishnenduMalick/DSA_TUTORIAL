package questions;

public class SmallestLetter {
  public static void main(String[] args) {
    char[] arr = {'c','f','j','k','m'};
    char target = 'm';
    char ans = small(arr, target);
    System.out.println(ans);
  }

  static char small(char[] arr, int target){
  
  int start = 0;
  int end = arr.length - 1;

  while (start <= end){
    // int mid = (start + end)/2;
    int mid = start + (end - start)/2;

    if(target < arr[mid]){
      end = mid - 1;
    }else{
      start = mid + 1;
  }
 } 
  return arr[start % arr.length];
}
}
