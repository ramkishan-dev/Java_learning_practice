//Optimize Soluctions for Bubble sort...
import java.util.*;
class optimizeBubbleSort{
    static void bubbleSort(int [] arr){

        for(int i=0; i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
              if(!swapped){
                break;
              }
        }
      
    }
    public static void main(String[] args){
        Scanner ab= new Scanner(System.in);
        // int arr[]={1,5,0,6,3,2};
        System.out.print("Enter the array isze: ");
        int n=ab.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Array Elements: ");
        for(int a=0; a<arr.length;a++){
            arr[a]=ab.nextInt();
        }
        bubbleSort(arr);
        System.out.print("Array is sorted: ");
        for(int num:arr){
        System.out.print(num+" ");
        }
    }
}