import java.util.Scanner;
public class ArrayMax{
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n=ab.nextInt();

        int arr[]=new int[n];
        System.out.print("Enter Elements: ");

        for(int a=0; a<n; a++)
            arr[a]=ab.nextInt();

            int max=arr[0];
            for(int a=0; a<n;a++){
                if(arr[a]>max)
                max=arr[a];
            }
            System.out.print("max: "+ max);

 }
}