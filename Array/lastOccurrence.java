class lastOccurrence{
    static int lastOccurence(int[] arr, int target){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={22,80,874,54,8,220};
        System.out.print(lastOccurence(arr,8));
    }
}