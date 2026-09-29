//Sum of Array using mehtod with return type /.. 
import java.util.*;
public class sumOfArray{
    static int sumOfArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner ab= new Scanner (System.in);
        System.out.print("Etner the Array size:");
        int n=ab.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Array Elements:");
        for(int a=0;a<n;a++){
            arr[a]=ab.nextInt();
        }

        int result=sumOfArray(arr);
        System.out.print("Sum is:"+ result);
    }

}