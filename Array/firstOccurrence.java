public class firstOccurrence{
    static int firstOccurrence(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={5,44,50,45,63,50};
        System.out.print(firstOccurrence(arr,50));
    }
}