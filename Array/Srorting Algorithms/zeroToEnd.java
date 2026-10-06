//Optimize soluctions..
class zeroToEnd{
    static void moveZeroToEnd(int[]arr){
        int j=0;
        int n=arr.length;
        for(int i=0; i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={0,5,2,0,1,0,8};
        moveZeroToEnd(arr);

        for(int num: arr){
            System.out.print(num+" ");
        }
    }

}