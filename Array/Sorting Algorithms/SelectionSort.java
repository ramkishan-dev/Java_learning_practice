//Selectin sorts:- Find the minimum element and plce the correct position...

import java.util.*;
public class SelectionSort{
    static void Selection(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex=i;
            for(int j=1+i; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
       
    }
    public static void main(String[] args){
        int arr[]={2,5,7,20,4,-9,2,6,-4};
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