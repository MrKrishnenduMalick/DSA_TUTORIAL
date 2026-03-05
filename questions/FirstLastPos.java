package questions;

public class FirstLastPos {

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        int[] result = position(arr, target);

        System.out.println(result[0] + " " + result[1]);
    }

    static int[] position(int[] arr, int target){

        int[] ans = {-1, -1};

        ans[0] = search(arr, target, true);   // first occurrence
        ans[1] = search(arr, target, false);  // last occurrence

        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex){

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;

                if(findStartIndex){
                    end = mid - 1;  // move left
                }
                else{
                    start = mid + 1;  // move right
                }
            }
        }
        return ans;
    }
}
