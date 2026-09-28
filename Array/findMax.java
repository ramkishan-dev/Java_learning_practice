public class findMax{
    public static void main(String [] args){
        int[] arr={5,8,7,9,77,5,60};
        
        // int max=arr[0];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
             
        }
        System.out.print(max);

    }
}