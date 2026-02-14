package linearsearch;

public class FindMin {
  public static void main(String[] args) {
    // input();

    int[] nums = {223,56,78,96,45,66,55,9,7,5,4};
    System.out.println(min(nums));
  }

  static int min(int[] arr){
    int ans = arr[0];
    for(int i = 0 ;i < arr.length; i++){
      if(arr[i] < ans){
        ans = arr[i];

      }
      return ans;
    }
    return -1;
  }
}
