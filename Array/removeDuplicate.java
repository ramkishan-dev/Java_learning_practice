class removeDuplicate{
    static int removeDuplicate(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int j=0;
        for(int i=1;i<arr.length; i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;

    }
    static void printArray(int[] arr, int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    } 
    public static void main(String[] args){
        int arr[]={1 ,1,2,2,5,4,4};
        int size=removeDuplicate(arr);
        printArray(arr, size);
    }
}