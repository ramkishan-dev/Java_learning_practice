  import java.util.*;
  class findUnique{
    static void findUnique(int[] arr){
        for(int i=0; i<arr.length;i++) {
            int count=0;
            for(int j=0; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Etner the Array size: ");
        int n=ab.nextInt();
        int[] arr=new int[n];
        System.out.print("Etner the Elements:");
        for(int a=0; a<n;a++){
            arr[a]=ab.nextInt();
        }
        findUnique(arr);
    }
  }