import java.util.*;

public class findDupli{
    static void DuplicateNo(int[] arr){

        for(int i=0;i<arr.length;i++){
            boolean duplicate=false;
            for(int j=0; j<i;j++){
                if(arr[i]==arr[j]){   
                    duplicate=true;
                    break;
                }
            }
             if(!duplicate){
            System.out.print(arr[i]+" ");
        }
       
        }

    }
    public static void main(String [] args){
        Scanner ab=new Scanner (System.in);
        System.out.print("Enter the array size; ");
    
        int n=ab.nextInt();
        int[] arr=new int[n];

        System.out.print("Enter the array Elements: ");
        for(int i=0;i<arr.length; i++){
            arr[i]=ab.nextInt();

        }
        DuplicateNo(arr);
    }
}