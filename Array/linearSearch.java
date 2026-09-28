//Linear search: Find the index of number...
class linearSearch{
    static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={5,9,4,50,65,445,54};
        int index=linearSearch(arr, 50);
        System.out.print("index is : "+ index);

    }
}