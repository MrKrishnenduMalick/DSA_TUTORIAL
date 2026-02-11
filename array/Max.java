package array;

public class Max {
  public static void main(String[] args) {
    int [] arr = {1,4,2,6,9,8};
    System.out.println(max(arr));
    System.out.println(maxRange(arr,1,3));
  }

  static int max(int [] arr){
    if(arr == null){
      return -1;
    }
    int maxVal = arr[0];
    for(int i = 1; i < arr.length;i ++){
      if(arr[i]>maxVal){
        maxVal = arr[i];
      }
    }
    return maxVal;
  }


  static int maxRange(int [] arr, int start, int end){
    if(end > start){
      return -1;
    }
    int maxVal = arr[start];
    for(int i = start; i <=end;i ++){
      if(arr[i]>maxVal){
        maxVal = arr[i];
      }
    }
    return maxVal;
  }
}
