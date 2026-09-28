//Linear search- Return AllOccurrence..
class allOccurrence{
    static void allOccurrence(int[] arr, int target ){
        System.out.print("Array is: ");
        for(int j=0; j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }

        System.out.print("\nindex is: ");
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        int arr []={5,54,8,5,8,10,5,9,5};
        allOccurrence(arr, 5);
    }

}