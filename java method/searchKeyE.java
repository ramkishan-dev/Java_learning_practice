import java.util.*;
public class searchKeyE{
    public static boolean searchE(int[] arr, int key){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Etnter the Array size:");
        int n=ab.nextInt();
        int[] arr=new int[n];

        System.out.print("Enter the Array Elemetn: ");
        for(int i=0; i<n; i++){
            arr[i]=ab.nextInt();
        }
        System.out.print("Enter the key, then search: ");
        int key=ab.nextInt();

        if(searchE(arr, key)){
            System.out.print("is fond! ");
        }
        else System.out.print("is not found!");
    }
}