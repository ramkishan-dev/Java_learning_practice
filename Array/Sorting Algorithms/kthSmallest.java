import java.util.*;
public class kthSmallest{
    static int kthSm(int[] arr, int k){
        for(int i=0; i<k; i++){
            // int minVal= Integer.MAX_VLUES;
            int minIndex=i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        return arr[k-1];
    }

    public static void main(String[] args){
        int arr[]={5,8,9,4,65,4,1,9};
        System.out.println(kthSm(arr, 5));
    }
}