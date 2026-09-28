import java.util.Scanner;
public class SumOfArray{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=ab.nextInt();
        int[] arr=new int[n];
        //int sum=0;
        System.out.print("Enter the array Elements: ");
        for(int i=0;i<n;i++)
         arr[i]=ab.nextInt();
        int target=15;
        System.out.print("Array elements: ");

        int d=arr[0];
        for(int i=1; i<n;i++){
        //sum+=arr[i];
        if(d+arr[i]==target){
             System.out.print(i +" ");
            break;
       
        }
         d=arr[i];


        }
       
    }
}