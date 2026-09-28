import java.util.Scanner;
public class MinArray{
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n=ab.nextInt();
         
         int arr[]=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int a=0; a<n;a++)
        arr[a]=ab.nextInt();

        int Min=arr[0];
        for(int a=0;a<n; a++){
            if(arr[a]<Min)
            Min=arr[a];
        }
        System.out.print("Min is:"+Min);

    }
}