import java.util.*;
public class findMax2{
    static int maxEle(int[] arr){
        int max=arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        return max; 
    }
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Etner the Array size: ");
        int n=ab.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array elements:");
        for(int i=0; i<n;i++){
            arr[i]=ab.nextInt();
        }
        System.out.print("max is: "+ maxEle(arr));
    }
}