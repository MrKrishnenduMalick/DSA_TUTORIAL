package linearsearch;

public class Main {
  public static void main(String[] args) {
    // input();

    int[] nums = {223,56,78,96,45,66,55,9,7,5,4};
    int target = 96;
    int ans = linearSearch(nums, target);
    int ans2 = linearSearch2(nums, target);
    System.out.println(ans);
    System.out.println(ans2);
  }

  static int linearSearch2(int[] arr,int target){
    if(arr.length == 0){
      return -1;
    }
    for(int index = 0; index< arr.length; index++){
      int element = arr[index];
      if (element == target){
        return element;
      }
    }
    return -1;
  } 

  // search in the array : return the index if item found
  static int linearSearch(int[] arr,int target){
    if(arr.length == 0){
      return -1;
    }

    // run for loop
    for(int index = 0; index< arr.length; index++){
      // check  fot element at every index if it is = target
      int element = arr[index];
      if (element == target){
        return index;
      }
    }
    // this line will execute if none of the return statements 
    return -1;
  } 

  


}
