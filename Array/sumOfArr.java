public class sumOfArr{
    static void sumArr(int[] arr){
        int sum=0; 
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.print("Sum of Array: "+ sum);
    }
    public static void main(String[] args){
        int[] arr={5,4,6,5,3,8};
        sumArr(arr);s
    }
}