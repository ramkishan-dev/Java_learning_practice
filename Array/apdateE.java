public class apdateE{
    static void update(int [] arr, int index, int value){
        arr[index]=value;
    }
    static void printArr(int[] arr){
        System.out.print("Updated Array: ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={2,3,5,7,20,13,17};
        update(arr, 4, 11);
        printArr(arr);
   }
}