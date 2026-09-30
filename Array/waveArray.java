//Wave Array....

import java.util.*;
public class waveArray{
    static void waveArray(int[] arr){
        for(int i=0; i<arr.length-1; i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String [] args){
        int arr[]= {2,5,6,8,10,15};
        waveArray(arr);
        System.out.print("Wave Array: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}