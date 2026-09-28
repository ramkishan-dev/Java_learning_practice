public class reverseinPlace{
    static void reverse(int[] arr){
        int first=0;
        int end=arr.length-1;
        while(first<end){
            int temp=arr[first];
            arr[first]=arr[end];
            arr[end]=temp;
            first++;
            end--;
        }
    }
        static void printArr(int[] arr){
                                          
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static void main(String[] args){
            
            int [] arr={5,7,69,87,20};
            reverse(arr);
            printArr(arr);
        }
}