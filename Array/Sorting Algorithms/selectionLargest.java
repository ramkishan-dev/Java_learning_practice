//Selectin sorts:- Find the minimum element and plce the correct position...

import java.util.*;
public class selectionLargest{
    static void Selection(int [] arr){
        for(int i=arr.length-1;i>0; i--){
            int maxIndex=i;
            for(int j=i-1;j>=0 ; j--){
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
       
    }
    public static void main(String[] args){
        int arr[]={7,15,8,-6,3,2};
          System.out.print("Array is:");
        for(int a=0; a<arr.length; a++){
            System.out.print(arr[a]+" ");
        }
           Selection(arr);
        System.out.print("\nSorting Array is: ");
         for(int num:arr){
        System.out.print(num+" ");
        }
        
    }
    
}