public class secondLargest{
    static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];

            }
            else if(arr[i]>second && arr[i]!=largest){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args){
        int[] arr={90,5,54,89,30,95};

        System.out.print("Second largest: "+ secondLargest(arr));
    }
}