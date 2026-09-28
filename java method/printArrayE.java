import java.util.*;
public class printArrayE{
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0)
            System.out.print(arr[i]+" ");
        }
       
    }
        public static void main(String [] args){
            Scanner ab=new Scanner(System.in);
            System.out.print("Enter the array size: ");
            int n=ab.nextInt();
            int[] arr=new int[n];
            System.out.print("Etner the array Elemets: ");
            for(int i=0; i<n; i++){
                arr[i]=ab.nextInt();
            }
            printArray(arr);
        }
    
}