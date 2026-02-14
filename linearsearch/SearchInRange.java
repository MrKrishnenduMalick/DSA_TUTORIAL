package linearsearch;

public class SearchInRange {
  public static void main(String[] args) {
     int[] nums = {223,56,78,96,45,66,55,9,7,5,4};
    int target = 96;
    int ans2 = linearSearch2(nums, target,4,6);
    System.out.println(ans2);
  }
  static int linearSearch2(int[] arr,int target,int start,int end){
    if(arr.length == 0){
      return -1;
    }
    for(int index = start; index< end; index++){
      int element = arr[index];
      if (element == target){
        return element;
      }
    }
    return -1;
  } 
}
