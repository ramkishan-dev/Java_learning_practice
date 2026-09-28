import java.util.*;
public class findMissing{
    static int missingNo(int[] arr, int n){
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<arr.length; i++){
            actualSum=actualSum+arr[i];
        }
        return expectedSum-actualSum;

    }
    public static void main(String [] args){
        Scanner ab=new Scanner (System.in);
        System.out.print("Etner the number:");
        int n=ab.nextInt();
        int[] arr=new int [n-1];
        System.out.print("Enter the "+(n-1)+" Array Elemenst: ");
        for(int i=0;i<arr.length; i++){
            arr[i]=ab.nextInt();
        }
        System.out.print("missing no: "+ missingNo(arr,n));
    }
}