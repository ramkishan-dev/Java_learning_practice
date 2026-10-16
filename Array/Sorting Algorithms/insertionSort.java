//Insetons Sort: the sorted array one leement at a time ..
import java.util.*;
class insertionSort{
    static void insertion(int[] arr){
        for(int i=1; i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args){
        int arr[]={5,3,8,4,6,2};

        insertion(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}