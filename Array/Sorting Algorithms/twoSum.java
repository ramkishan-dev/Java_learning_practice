//Find two sum:- 
import java.util.*;
public class twoSum{
    static boolean twoSumSorting(int[] arr, int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                return true;
            }
            else if(arr[i]+arr[j]>target) {
            j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            } 
        }
        return false;
    }
   public static void main(String[] args) {
        int arr[]={5,1,2,4,1,58,9};
        int target=13;
    //    boolean result= twoSumSorting(arr, target);
        System.out.print(twoSumSorting(arr, target));

    }
}
//time complexity: O(n log n)
//Space Complexity: O(1)