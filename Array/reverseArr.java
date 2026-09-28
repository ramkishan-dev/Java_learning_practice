import java.util.*;
public class reverseArr{
    static void reverseA(int[] arr){
        System.out.print("Reverse Array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the Array size; ");
        int n=ab.nextInt();
        int[] arr=new int[n];
        System.out.print("Etner the array Elemetns: ");
        for(int i=0;i<n;i++){
            arr[i]=ab.nextInt();
        }
        System.out.print("Print Arrya: ");
        for(int a=0; a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
        System.out.println();
        reverseA(arr);
    }

}