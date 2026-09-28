import java.util.*;
public class sumOfarray{
    static int sumArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Etner the Array size: ");
        int n=ab.nextInt();
        int[] arr=new int[n];

        System.out.print("Enter the array Elements: ");
        for(int i=0; i<n; i++){
            arr[i]=ab.nextInt();
        }
        int result=sumArray(arr);
        System.out.print("sum is: "+ result);
    }
}