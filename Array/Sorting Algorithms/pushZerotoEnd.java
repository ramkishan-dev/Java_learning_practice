// moves zero elements to End ....
class pushZerotoEnd{
    static void PushzeroEnd(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[]= {0,5,0,8,0,4,0};
        PushzeroEnd(arr);

        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    
}