import java.util.*;
public class reverseArray2{
    static void reverse(int[] arr){
        int start =0;
        int end= arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the Aray size: ");
        int n=ab.nextInt();
        int[] arr=new int[n];

        System.out.print("Enter the Array Elements: ");
        for(int i=0;i<n; i++){
            arr[i]=ab.nextInt();
        }
        reverse(arr);
        System.out.print("Reverse Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}