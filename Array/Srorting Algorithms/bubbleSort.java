//Bubble Sort:- Repeatdly compare adjacent elements and Swap..
import java.util.*;
public class bubbleSort{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the Arrray size: ");
        int n=ab.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Array Elemetns: ");
        for(int a=0; a<n; a++){
            arr[a]=ab.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }      
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }  
    }
}